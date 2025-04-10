//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Saddle_Point {
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int svj = 0;
//            for (int j = 1; j < arr[0].length; j++) {
//                if (arr[i][j] < arr[i][svj]) {
//                    svj = j;
//                }
//            }
//
//            boolean flag = true;
//            for (int k = 0; k < arr.length; k++) {
//                if (arr[k][svj] > arr[i][svj]) {
//                    flag = false;
//                    break;
//                }
//            }
//
//            if (flag == true) {
//                System.out.println(arr[i][svj]);
//                return;
//            }
//        }
//        System.out.println("Invalid Input");
//    }
//}










package _2D_Arrays;

import java.util.Scanner;

public class Saddle_Point {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for size of square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Loop to find saddle point
        for (int i = 0; i < arr.length; i++) {
            // Step 1: Find the smallest element in the current row
            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }

            // Step 2: Check if this smallest element is also the largest in its column
            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]) {
                    flag = false;
                    break;
                }
            }

            // If it's a saddle point, print and return
            if (flag) {
                System.out.println("Saddle Point: " + arr[i][svj]);
                return;
            }
        }

        // If no saddle point is found
        System.out.println("Invalid Input (No Saddle Point Found)");
    }
}
