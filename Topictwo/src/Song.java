/**
 * The Song class represents a music track with various attributes 
 * such as title, duration, single status, and associated artist.
 */
public class Song {
   public String songTitle; // The title of the song
   public int duration; // The duration of the song in minutes
   public boolean isSingle; // Indicates whether the song is a single (true) or part of an album (false)
   public Artist artist; // The artist associated with the song

   /**
    * Constructor to initialize a Song object with its attributes.
    *
    * @param songTitle The title of the song
    * @param duration The duration of the song in minutes
    * @param isSingle Indicates if the song is a single
    * @param artist The artist associated with the song
    */
   public Song(String songTitle, int duration, boolean isSingle, Artist artist) {
       this.songTitle = songTitle; // Assign the song title to the class variable
       this.duration = duration; // Assign the song duration to the class variable
       this.isSingle = isSingle; // Assign the single status to the class variable
       this.artist = artist;
   }

   /**
    * Returns the title of the song.
    *
    * @return The title of the song
    */
   public String getTitle() {
       return songTitle; // Return the song title
   }

    /**
     * Returns the duration of the song.
     *
     * @return The duration of the song in minutes
     */
    public int getDuration() {
        return duration; // Return the song duration
    }

   /**
    * Checks if the song is a single.
    *
    * @return true if the song is a single, false otherwise
    */
   public boolean isSingle() {
       return isSingle; // Return the single status
   }

   /**
    * Returns the artist associated with the song.
    *
    * @return The Artist object representing the song's artist
    */
   public Artist getArtist() {
       return artist; // Return the associated artist
   }
   // Override the toString() method to display album details. 
   @Override
   public String toString() {
       return "Song title: " + songTitle + ", Duration: " + duration + " seconds,  Single: " + isSingle + ", Artist: " + artist;
   }
   
   


}

