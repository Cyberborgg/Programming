import java.util.ArrayList;

/**
 * The Playlist class represents a music playlist containing songs,
 * allowing for operations like adding songs, playing current songs,
 * and navigating through the playlist.
 */
public class Playlist {
    public SongNode head;   // First song in the playlist
    public SongNode tail;   // Last song in the playlist
    public SongNode current; // Current song node being played

    /**
     * Constructor to initialize an empty playlist.
     */
    public Playlist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }

    /**
     * Adds a song to the end of the playlist.
     *
     * @param song The song to be added
     */
    public void addSong(Song song) {
        SongNode newNode = new SongNode(song);
        if (head == null) {
            head = newNode; // The first song added
            tail = newNode; // Head and tail are the same
        } else {
            tail.next = newNode; // Link the new node to the end
            newNode.previous = tail; // Link the previous node
            tail = newNode; // Update the tail to the new node
        }
        // Set the current song to the head if it's the first song
        if (current == null) {
            current = head;
        }
    }

    /**
     * Plays the current song in the playlist.
     */
    public void playCurrentSong() {
        if (current != null) {
            System.out.println("Playing: " + current.song.songTitle);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    /**
     * Recursively skips to the next song and plays it.
     */
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next; // Move to the next song
            playCurrentSong(); // Play the current song
            nextSong(); // Recur for the next song
        } else {
            System.out.println("Reached the end of the playlist.");
        }
    }

    /**
     * Recursively plays the previous song.
     */
    public void previousSong() {
        if (current != null && current.previous != null) {
            current = current.previous; // Move to the previous song
            playCurrentSong(); // Play the current song
            previousSong(); // Recur for the previous song
        } else {
            System.out.println("Reached the start of the playlist.");
        }
    }

    /**
     * Shuffles the playlist by rearranging the songs randomly.
     */
    public void shuffle() {
        // Store nodes in an ArrayList
        ArrayList<SongNode> nodes = new ArrayList<>();
        SongNode temp = head;
        while (temp != null) {
            nodes.add(temp); // Add each node to the list
            temp = temp.next;
        }

        // Custom shuffle algorithm (Fisher-Yates shuffle)
        for (int i = nodes.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1)); // Get a random index
            // Swap nodes
            SongNode tempNode = nodes.get(i);
            nodes.set(i, nodes.get(j));
            nodes.set(j, tempNode);
        }

        // Rebuild the linked list from the shuffled nodes
        head = nodes.get(0);
        SongNode previousNode = head;
        head.previous = null;

        for (int i = 1; i < nodes.size(); i++) {
            SongNode currentNode = nodes.get(i);
            previousNode.next = currentNode; // Link previous node to current
            currentNode.previous = previousNode; // Link current to previous
            previousNode = currentNode; // Move to the current node
        }

        tail = previousNode; // Update the tail
        tail.next = null; // Ensure the last node's next is null

        // Reset current to head after shuffle
        current = head;
        playCurrentSong(); // Play the first song in the shuffled playlist
    }

    /**
     * Plays the entire playlist from start to finish using recursion.
     *
     * @param currentNode The current song node to be played
     */
    public void playAll(SongNode currentNode) {
        if (currentNode == null) {
            return; // Base case for recursion
        }
        System.out.println("Playing: " + currentNode.song.songTitle); // Play current song
        playAll(currentNode.next); // Recur for the next song
    }

    /**
     * Starts playing all songs from the beginning of the playlist.
     */
    public void startPlayingAll() {
        if (head != null) {
            playAll(head); // Begin recursion from the head
        } else {
            System.out.println("Playlist is empty.");
        }
    }
}
