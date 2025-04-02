package Recursion;

import java.util.*;
import java.io.*;

public class Print_Maze_Paths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, n, m, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){


        // BaseCase
        if (sr > dr || sc > dc){  // diwaal tod k bahar nika gaye
            return;
        }

        if (sr == dr && sc == dc){
            System.out.println(psf);    // psf = path so far
            return;
        }




        printMazePaths(sr, sc + 1, dr, dc,psf + "h");
        printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    }
}
