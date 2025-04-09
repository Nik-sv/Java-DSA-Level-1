package _2D_Arrays;

import java.util.Scanner;

public class Spiral_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create and fill the matrix
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Define the boundaries for spiral traversal
        int minr = 0;           // top boundary
        int minc = 0;           // left boundary
        int maxr = arr.length - 1;  // bottom boundary
        int maxc = arr[0].length - 1; // right boundary
        int tne = n * m;        // total number of elements
        int cnt = 0;            // count of printed elements

        // Traverse in spiral order
        while (cnt < tne) {
            // Left wall (top to bottom)
            for (int i = minr; i <= maxr && cnt < tne; i++) {
                System.out.println(arr[i][minc]);
                cnt++;
            }
            minc++;

            // Bottom wall (left to right)
            for (int j = minc; j <= maxc && cnt < tne; j++) {
                System.out.println(arr[maxr][j]);
                cnt++;
            }
            maxr--;

            // Right wall (bottom to top)
            for (int i = maxr; i >= minr && cnt < tne; i--) {
                System.out.println(arr[i][maxc]);
                cnt++;
            }
            maxc--;

            // Top wall (right to left)
            for (int j = maxc; j >= minc && cnt < tne; j--) {
                System.out.println(arr[minr][j]);
                cnt++;
            }
            minr++;
        }

        sc.close();
    }
}
