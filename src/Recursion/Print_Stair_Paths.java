package Recursion;

import java.util.*;
import java.io.*;

public class Print_Stair_Paths {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {


        // BaseCase

         if (n < 0){   // ye  galat rasta hai
             return;
         }

         if (n == 0){  // ye sahi rasta hai
             System.out.println(path);
             return;
         }

        // Levels and Options = aap 1,2,3 => 3no options express kardo naye naye options ban jayege

        printStairPaths(n - 1, path + "1");
        printStairPaths(n - 2, path + "2");
        printStairPaths(n - 3, path + "3");
    }

}
