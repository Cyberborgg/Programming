/**
 * The SongNode class represents a node in a doubly linked list 
 * that contains a Song object and references to the next and previous nodes.
 */
public class SongNode {
    public Song song; // The Song object contained in this node
    public SongNode next; // Reference to the next SongNode in the list
    public SongNode previous; // Reference to the previous SongNode in the list

    /**
     * Constructor to initialize a SongNode with a given Song.
     *
     * @param song The Song object to be stored in this node
     */
    
    public SongNode(Song song, SongNode next) {
        this.song = song; // Assign the provided Song to the song variable
        this.next = next; // Initialize the next reference to null (no next node yet)
        this.previous = null; // Initialize the previous reference to null (no previous node yet)
    }
    
}
