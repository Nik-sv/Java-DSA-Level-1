//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public interface Diagonal_Traversal {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int g = 0; g < arr.length; g++) {
//            for (int i = 0 , j = g; j < arr.length; i++ , j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
//    }
//}
































package _2D_Arrays;

import java.util.Scanner;

public class Diagonal_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the size of square matrix as input
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        // Taking matrix input from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDiagonal Traversal (Top-right to Bottom-left):");

        // Loop to traverse diagonals from top-right to bottom-left
        for (int g = 0; g < arr.length; g++) {
            // i starts from 0, j from g (column)
            for (int i = 0, j = g; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
