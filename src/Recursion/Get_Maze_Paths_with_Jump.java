//package Recursion;
//
//import java.util.*;
//import java.io.*;
//
//public class Get_Maze_Paths_with_Jump {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        ArrayList<String> paths =  getMazePaths(1, 1, n, m);
//        System.out.println(paths);
//    }
//
//    // sr - source row
//    // sc - source column
//    // dr - destination row
//    // dc - destination column
//    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
//
//        // BaseCase
//
//        if (sr == dr && sc == dc) {   // Agar source row aur source coloumn dono uske barabar hogaye tho tum pauch gaye
//            ArrayList<String> bres = new ArrayList<>();
//            bres.add("");
//            return bres;
//        }
//
//
//        // Appko sr , sc se dr , dc k paths banane hai
//        // Appse se Expectation hai app sr , sc se dr , dc k paths dege
//
//        ArrayList<String> paths = new ArrayList<>();
//
//        // horizontal moves
//        for (int ms = 1; ms <= dc - sc; ms++) {
//            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);         // agar aapne ek ka jump lagaya tho sr , sc + 1 pe pahuch gaye agar 2 ka lagaya tho sr , sc + 2 mai ....                           // Ab ham laga rahe hai faith ye kar k ham jaha bhi pahuchege waha se aage k paths hame mil jayege hpaths , horizontal wala hissa hai tho kuch change nahi hoga sc + h  , aur ab loop mai isse ms = movesize bula lo
//            // ab hame aisa kya karan hai ki ye horizontal paths se dr , dc  k paths ban jaaye  ,, tho inke muu pe h1 , h2 jaise cheze lagani padegi
//            for (String hpath : hpaths) {
//                paths.add("h" + ms + hpath);
//            }
//        }
//
//
//        // vertical moves
//        for (int ms = 1; ms <= dr - sr; ms++) {
//            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);         // agar aapne ek ka jump lagaya tho sr + 1 , sc pe pahuch gaye agar 2 ka lagaya tho sr , sr + 2 mai ....                           // Ab ham laga rahe hai faith ye kar k ham jaha bhi pahuchege waha se aage k paths hame mil jayege hpaths , horizontal wala hissa hai tho kuch change nahi hoga sc + h  , aur ab loop mai isse ms = movesize bula lo
//            // ab hame aisa kya karan hai ki ye vertical paths se dr , dc  k paths ban jaaye  ,, tho inke muu pe v1 , v2 jaise cheze lagani padegi
//            for (String vpath : vpaths) {
//                paths.add("v" + ms + vpath);
//            }
//        }
//
//
//        // digonal moves
//        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
//            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);   //  so digonal mai sr + ms bhi hoga aur sc + ms bhi hoga bec dono taraf se badh rara hai
//            // ab hame aisa kya karan hai ki ye digonal paths se dr , dc  k paths ban jaaye  ,, tho inke muu pe h1v1 , h2v2 jaise cheze lagani padegi
//            for (String dpath : dpaths) {
//                paths.add("d" + ms + dpath);
//            }
//        }
//
//        return paths;
//
//    }
//}




















package Recursion;

import java.util.*;
import java.io.*;

public class Get_Maze_Paths_with_Jump {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows in the maze
        int m = sc.nextInt(); // Number of columns in the maze

        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths); // Printing all possible paths
    }

    /**
     * Function to get all possible paths from (sr, sc) to (dr, dc)
     * where we can move horizontally, vertically, and diagonally with jumps
     */
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        // Base Case: If source reaches destination, return a list with an empty string
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); // Empty string denotes reaching destination
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>(); // Stores all possible paths

        // Horizontal Moves
        for (int ms = 1; ms <= dc - sc; ms++) { // Move size can be from 1 to (dc - sc)
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath); // Prefix 'h' for horizontal move
            }
        }

        // Vertical Moves
        for (int ms = 1; ms <= dr - sr; ms++) { // Move size can be from 1 to (dr - sr)
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath); // Prefix 'v' for vertical move
            }
        }

        // Diagonal Moves
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) { // Move size limited by both row & column
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath); // Prefix 'd' for diagonal move (Fixed from 'h' to 'd')
            }
        }

        return paths; // Return the list of all possible paths
    }
}