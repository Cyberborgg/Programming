import java.util.ArrayList;




public class Album {
    // Title of the album 
    public String title; 
    public int releaseYear; // The year the album was released
    public ArrayList<Song> music; // List of songs in the album
    public Artist artist; // The artist associated with the album

    // Parameterized Constructor
    public Album(String title, int releaseYear, Artist artist) {
        this.title = title; // Set the album title
        this.releaseYear = releaseYear; // Set the release year
        this.artist = artist; // Set the artist for the album
        this.music = new ArrayList<>(); // Initialize the music list to store songs
    }

    // Method to add a song to the album
    public void addSong(Song song) {
        music.add(song);
    }

    // Method to get all songs in the album
    public ArrayList<Song> getSongs() {
        return music;
    }

    // Method to get the album's title
    public String getTitle() {
        return title;
    }

    // Method to get the release year of the album
    public int getReleaseYear() {
        return releaseYear;
    }

    // Method to get the artist of the album
    public Artist getArtist() {
        return artist;
    }

    // Override the toString() method to display album details
    @Override
    public String toString() {
        return "Album: " + title + ", Release Year: " + releaseYear + ", Artist: " + artist.getName();
    }
}


