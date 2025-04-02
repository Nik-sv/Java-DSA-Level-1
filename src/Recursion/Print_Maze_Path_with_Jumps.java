//package Recursion;
//
//import java.util.*;
//import java.io.*;
//
//
//public class Print_Maze_Path_with_Jumps {
//
//    public static void main(String[] args) {
//       Scanner sc  = new Scanner(System.in);
//       int n = sc.nextInt();
//       int m = sc.nextInt();
//       printMazePaths(1,1,n, m, "");
//    }
//
//    // sr - source row
//    // sc - source column
//    // dr - destination row
//    // dc - destination column
//    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){
//
//
//        // BaseCase
//
//
//        if (sr == dr && sc == dc){   // is baar call smartly lagai hai
//            System.out.println(psf);
//            return;
//        }
//
//
//
//
//        // horizontal move
//        for (int ms = 1; ms < dc - sc; ms++) {
//            printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms);
//        }
//
//        // vertical move
//        for (int ms = 1; ms < dr - sr; ms++) {
//            printMazePaths(sr + ms, sc, dr, dc, psf + "v" + ms);
//        }
//
//        // Digonal move
//        for (int ms = 1; ms < dc - sc && ms <= dr - sr; ms++) {
//            printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
//        }
//    }
//
//}




package Recursion;

import java.util.*;

public class Print_Maze_Path_with_Jumps {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, n, m, "");
    }

    /**
     * Recursive function to print all maze paths with jumps
     * @param sr: source row
     * @param sc: source column
     * @param dr: destination row
     * @param dc: destination column
     * @param psf: path so far
     */
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){

        // Base Case: If source reaches destination, print path
        if (sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        // Horizontal moves
        for (int ms = 1; ms <= dc - sc; ms++) {
            printMazePaths(sr, sc + ms, dr, dc, psf + "h" + ms);
        }

        // Vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            printMazePaths(sr + ms, sc, dr, dc, psf + "v" + ms);
        }

        // Diagonal moves
        for (int ms = 1; ms <= Math.min(dc - sc, dr - sr); ms++) {
            printMazePaths(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
        }
    }
}


