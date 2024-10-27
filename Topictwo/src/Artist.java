

public class Artist {
    
    // Attributes
    public String artistName; // Name of the artist or band
    public String genre; // Genre of the music
    public boolean isSolo; // Flag indicating if the artist is a solo artist or a band

    // Constructor
    public Artist(String artistName, String genre, boolean isSolo) {
        this.artistName = artistName; // Set the artist's name
        this.genre = genre; // Set the genre
        this.isSolo = isSolo; // Set whether the artist is solo or a band
    }

    // Getter methods
    public String getName() {
        return artistName; // Get the artist's name
    }

    public String getGenre() {
        return genre; // Get the music genre
    }

    public boolean isSolo() {
        return isSolo; // Check if the artist is a solo artist
    }

    // Override the toString() method to provide a string representation of the Artist
    @Override
    public String toString() {
        return "Artist: " + artistName + " (" + genre + ") " + (isSolo ? "Solo" : "Band");
    }
}
