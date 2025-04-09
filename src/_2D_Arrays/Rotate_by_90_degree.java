//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Rotate_by_90_degree {
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();  // size of square matrix
//
//        int[][] arr = new int[n][n];
//        // Input the matrix
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        // Step 1: Transpose the matrix (swap rows with columns)
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr[0].length; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//
//        // Step 2: Reverse each row
//        for (int i = 0; i < arr.length; i++) {
//            int li = 0;
//            int ri = arr[i].length - 1;
//            while (li < ri) {
//                int temp = arr[i][li];
//                arr[i][li] = arr[i][ri];
//                arr[i][ri] = temp;
//                li++;
//                ri--;
//            }
//        }
//
//        // Display the rotated matrix
//        display(arr);
//    }
//
//    public static void display(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}









package _2D_Arrays;

import java.util.Scanner;

public class Rotate_by_90_degree {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Input the size of the square matrix
        int n = sc.nextInt();

        // Create and take input for the matrix
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose the matrix
        // Transposing means converting rows to columns (swap arr[i][j] with arr[j][i])
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to get the rotated matrix
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[i].length - 1;

            // Swap elements from both ends moving toward the center
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }

        // Display the rotated matrix
        display(arr);
    }

    // This function prints the matrix in a row-wise format
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to next line after each row
        }
    }
}









