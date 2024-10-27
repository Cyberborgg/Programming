public class App {
    public static void main(String[] args) throws Exception {

            // Unit Testing //
        // test 1
        Artist ar1 = new Artist("Wallows", "Alternative Indie", false);
        // should print Wallows (Alternative Indie) Band
        System.out.println(ar1);

        // test 2
        Artist ar2 = new Artist("Dhar Mann", "CROCODILE", true);
        System.out.println(ar2);

        // test 3
        Album al1 = new Album("Nothing Happens", 2019, ar1);
        System.out.println(al1);

        // test 4
        Album al2 = new Album("!!!!!", 10000000, ar2);
        System.out.println(al2);
        
        // test 5
        Band ba1 = new Band("Wallows", 2017);
        System.out.println(ba1);

        // test 6
        Band ba2 = new Band("Waluidingus", -2018);
        System.out.println(ba2);

        // test 7
        Song so1 = new Song("Remember When", 155, false, ar1);
        System.out.println(so1);

        // test 8
        Song so5 = new Song("", 192934542, true, ar2);
        System.out.println(so5);

        // test 9
        Song so1423 = new Song("9weasdoilfh", -1398489312, false, ar2);
        System.out.println(so1423);
        
        // test 9
        Song so2 = new Song("Are you bored yet?", 211, true, ar1);
        SongNode sn2 = new SongNode(so2, null);
        SongNode sn1 = new SongNode(so1, sn2);
        System.out.println(sn1.next.song);
        
        // Test 8




    }
}
