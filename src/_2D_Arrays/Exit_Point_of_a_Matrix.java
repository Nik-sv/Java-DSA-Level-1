//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Exit_Point_of_a_Matrix {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[][] arr = new int[n][m];
//        for (int i = 0; i <arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int dir = 0;  // 0 -> e , 1 -> s , 2 -> w and 3 -> n
//        int i = 0;
//        int j = 0;
//
//        while (true) {
//
//            dir = (dir + arr[i][j]) % 4;   // ye aap ko nayi direction nikaalne mai help karega kaise karega
//            if (dir == 0) {   // east
//                j++;
//            } else if (dir == 1) {   // south
//                i++;
//            } else if (dir == 2) {   // west
//                j--;
//            } else if (dir == 3) {   // north
//                i--;
//            }
//
//            // bahar aa ne ki conditions
//
//            if (i < 0) {
//                i++;
//                break;
//            } else if (j < 0) {
//                j++;
//                break;
//            } else if (i == arr.length) {
//                i--;
//               break;
//            } else if (j == arr[0].length) {
//                j--;
//                break;
//            }
//        }
//
//        System.out.println(i);
//        System.out.println(j);
//    }
//}























package _2D_Arrays;

import java.util.Scanner;

public class Exit_Point_of_a_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of rows (n) and columns (m)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create and populate the 2D matrix
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int dir = 0; // Direction tracker: 0 - East, 1 - South, 2 - West, 3 - North
        int i = 0, j = 0; // Start from top-left corner of the matrix

        // Move in the matrix until you exit
        while (true) {
            // Update direction based on the current cell value
            dir = (dir + arr[i][j]) % 4;

            // Move one step in the current direction
            if (dir == 0) {
                j++; // Move East
            } else if (dir == 1) {
                i++; // Move South
            } else if (dir == 2) {
                j--; // Move West
            } else if (dir == 3) {
                i--; // Move North
            }

            // Check for exit conditions: if we go outside the matrix
            if (i < 0) {
                i++; // Move back inside from top
                break;
            } else if (j < 0) {
                j++; // Move back inside from left
                break;
            } else if (i == arr.length) {
                i--; // Move back inside from bottom
                break;
            } else if (j == arr[0].length) {
                j--; // Move back inside from right
                break;
            }
        }

        // Print the exit point coordinates
        System.out.println(i);
        System.out.println(j);
    }
}

