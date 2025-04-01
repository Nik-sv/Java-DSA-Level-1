//package Recursion;
//
//import java.util.*;
//import java.io.*;
//
//public class Get_Maze_Paths {
//    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        ArrayList<String> paths = getMazePaths(1,1,n,m);   // yaha   (1,1) se (n,n) tak jana hai
//        System.out.println(paths);
//    }
//    // sr = source row
//    // sc = source column
//    // dr = destination  row
//    // dc = destination column
//
//    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
//
//      // BaseCase => Likhana hai hamko
//
//        if (sr == dr && sc == dc){   // aur who ek rasta hai ki wahi kaderaho = [.]
//            ArrayList<String> bres = new ArrayList<>();
//            bres.add("");
//            return bres;
//        }
//
//
//
//
//
//
//
//
//
//        ArrayList<String> hpaths = new ArrayList<>();   // ab jab bahar jaa raha hai iske liye horizontal path ko bas declare kar ligea  ya new Arraylist bana lo
//        ArrayList<String> vpaths = new ArrayList<>();   // aur same as vertical path ko declare kar ligea
//
//
//
//        if (sc < dc){  // aap last column mai na ho horizontal call k liye // matlab aap right wall pe nahi hai aap thode se andar hai
//           hpaths =   getMazePaths(sr, sc + 1, dr, dc); // tho aap horizontal call laga sakte hai   // ye horizontal move hai kyuki column badh raha hai
//        }
//
//        if (sr < dr){  // aap last row mai na ho vertical call lagne k liye
//            vpaths = getMazePaths(sr + 1, sc, dr, dc);  // tho aap vertical call laga sakte hai   // aur hame faith ye bhi hai  ki hame agar mai ek vertical motion karu tho mai pahuchuga sr + 1 pe aur column chage nahi hoga
//        }
//
//         ArrayList<String> paths = new ArrayList<>();
//
//        for (String hpath: hpaths){
//            paths.add("h" + hpath);
//        }
//
//        for (String vpath: vpaths){
//            paths.add("v" + vpath);
//        }
//
//        return paths;
//    }
//}











package Recursion;

import java.util.*;

public class Get_Maze_Paths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows (destination row)
        int m = sc.nextInt(); // Number of columns (destination column)
        sc.close(); // Closing scanner to avoid memory leak

        // Function call to get all possible maze paths from (1,1) to (n,m)
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths); // Printing all possible paths
    }

    /**
     * This function returns all possible paths to reach (dr, dc) from (sr, sc)
     * by moving only right (horizontal) or down (vertical).
     *
     * @param sr Source row (starting row)
     * @param sc Source column (starting column)
     * @param dr Destination row (ending row)
     * @param dc Destination column (ending column)
     * @return An ArrayList of strings representing all possible paths
     */
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // Base Case: If the current position is the destination, return an empty path
        if (sr == dr && sc == dc) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add(""); // Adding empty string to indicate a valid path
            return baseResult;
        }

        // Lists to store paths obtained from recursive calls
        ArrayList<String> hpaths = new ArrayList<>(); // Stores horizontal paths
        ArrayList<String> vpaths = new ArrayList<>(); // Stores vertical paths

        // Move Right (Horizontal) if not at the last column
        if (sc < dc) {
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }

        // Move Down (Vertical) if not at the last row
        if (sr < dr) {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        // Combining the paths with appropriate direction markers
        ArrayList<String> paths = new ArrayList<>();

        // Add 'h' prefix for horizontal paths
        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }

        // Add 'v' prefix for vertical paths
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }

        return paths; // Returning all possible paths
    }
}
