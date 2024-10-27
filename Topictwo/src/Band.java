import java.util.ArrayList;

/**
 * The Band class represents a music band with a name, formation year, 
 * and a list of its members (Artists).
 */
public class Band {
    // The year the band was formed
    public int formationYear;
    // List of band members (Artists)
    public ArrayList<Artist> members; 
    // The name of the band
    public String bandName; 

    /**
     * Constructor to initialize a Band object with a name and formation year.
     *
     * @param bandName      The name of the band
     * @param formationYear The year the band was formed
     */
    public Band(String bandName, int formationYear) {
        this.bandName = bandName;
        this.formationYear = formationYear;
        this.members = new ArrayList<>(); // Initializes the members list
    }

    /**
     * Adds a member (Artist) to the band.
     *
     * @param member The Artist to be added to the band
     */
    public void addMember(Artist member) {
        members.add(member);
    }

    /**
     * Returns the list of members in the band.
     *
     * @return ArrayList of Artist objects representing the band members
     */
    public ArrayList<Artist> getMembers() {
        return members;
    }

    /**
     * Returns the formation year of the band.
     *
     * @return The year the band was formed
     */
    public int getFormationYear() {
        return formationYear;
    }

    /**
     * Returns the name of the band.
     *
     * @return The name of the band
     */
    public String getBandName() {
        return bandName;
    }

    // Override the toString() method to display album details. 
    @Override
    public String toString() {
        return "Band name: " + bandName + ", Formation Year: " + formationYear;
    }
}






