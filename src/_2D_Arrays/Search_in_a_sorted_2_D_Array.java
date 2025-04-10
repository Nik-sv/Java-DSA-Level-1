//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Search_in_a_sorted_2_D_Array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
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
//        int x = sc.nextInt();
//
//        int i = 0;
//        int j = arr[0].length - 1;
//
//        while (i < arr.length && j >= 0) {
//            if (x == arr[i][j]) {
//                System.out.println(i);
//                System.out.println(j);
//                return;
//            } else if (x < arr[i][j]) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//
//        System.out.println("Not Found");
//    }
//}
















package _2D_Arrays;

import java.util.Scanner;

public class Search_in_a_sorted_2_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of the matrix
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println("Element found at: Row = " + i + ", Column = " + j);
                return;
            } else if (x < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("Not Found");
    }
}

