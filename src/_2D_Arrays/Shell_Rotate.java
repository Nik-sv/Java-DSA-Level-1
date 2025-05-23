//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Shell_Rotate {
//
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[][] arr = new int[n][m];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int s = sc.nextInt();  // aapko shell bhi puchna padega
//        int r = sc.nextInt();  // Kitne se rotate karna chate hai ye bhi puchna padega
//
//        rotateShell(arr, s, r);
//        display(arr);
//    }
//
//    public static int[] fillOnedFromShell(int[][] arr, int s) {
//          int minr = s - 1;
//          int minc = s - 1;
//          int maxr = arr.length - s;
//          int maxc = arr[0].length - s;
//
//
//          // lw
//        for (int i = minr ,  j = minc; i <= maxr; i++ ) {
//            arr[i][j] = arr[i][j];
//            idx++;
//        }
//         // bw
//
//        for (int i = maxr ,  j = minc + 1; i <= maxc; j++ ) {
//            arr[i][j] = arr[i][j];
//            idx++;
//        }
//
//         // rw
//
//        for (int i = minr - 1 ,  j = maxc; i >= minr; i--) {
//            arr[i][j] = arr[i][j];
//            idx++;
//        }
//
//         // tw
//
//        for (int i = minr ,  j = maxc - 1; j <= maxc + 1; j-- ) {
//            arr[i][j] = arr[i][j];
//            idx++;
//        }
//
//
//
//    }
//
//    public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
//        int minr = s - 1;
//        int minc = s - 1;
//        int maxr = arr.length - s;
//        int maxc = arr[0].length - s;
//        int sz = 2 * ( maxr - minr + maxc - minc);
//
//        int[] oned = new int[sz];
//
//        // lw
//        for (int i = minr ,  j = minc; i <= maxr; i++ ) {
//            oned[idx] = arr[i][j];
//            idx++;
//        }
//        // bw
//
//        for (int i = maxr ,  j = minc + 1; i <= maxc; j++ ) {
//            oned[idx] = arr[i][j];
//            idx++;
//        }
//
//        // rw
//
//        for (int i = minr - 1 ,  j = maxc; i >= minr; i--) {
//            oned[idx] = arr[i][j];
//            idx++;
//        }
//
//        // tw
//
//        for (int i = minr ,  j = maxc - 1; j <= maxc + 1; j-- ) {
//            oned[idx] = arr[i][j];
//            idx++;
//        }
//
//
//        return oned;
//    }
//
//    public static void rotateShell(int[][] arr, int s, int r) {
//        int[] oned = fillOnedFromShell(arr, s);
//        rotate(oned, r);
//        fillShellFromOned(arr, s, oned);
//    }
//
//    public static void rotate(int[] oned, int r) {
//         r = r % oned.length;
//         if (r < 0) {
//             r = r + oned.length;
//         }
//
//         reverse(oned, 0, oned.length - r - 1);
//         reverse(oned, oned.length - r, oned.length - 1);
//         reverse(oned, 0, oned.length - 1);
//
//
//    }
//
//
//    public static void reverse(int[] oned, int li, int ri) {
//        while ( li < ri) {
//            int temp = oned[li];
//            oned[li] = oned[ri];
//            oned[ri] = temp;
//
//            li++;
//            ri--;
//    }
//
//    public static void display(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//
//}
//
//
//
//    public static void display(int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}















package _2D_Arrays;

import java.util.Scanner;

public class Shell_Rotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] arr = new int[n][m];

        // Matrix input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt(); // shell number (1-based)
        int r = sc.nextInt(); // number of rotations

        // Rotate shell
        rotateShell(arr, s, r);

        // Display rotated matrix
        display(arr);
    }

    public static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);
    }

    public static int[] fillOnedFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[size];
        int idx = 0;

        // Left wall
        for (int i = minr; i <= maxr; i++) {
            oned[idx++] = arr[i][minc];
        }

        // Bottom wall
        for (int j = minc + 1; j <= maxc; j++) {
            oned[idx++] = arr[maxr][j];
        }

        // Right wall
        for (int i = maxr - 1; i >= minr; i--) {
            oned[idx++] = arr[i][maxc];
        }

        // Top wall
        for (int j = maxc - 1; j >= minc + 1; j--) {
            oned[idx++] = arr[minr][j];
        }

        return oned;
    }

    public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;

        // Left wall
        for (int i = minr; i <= maxr; i++) {
            arr[i][minc] = oned[idx++];
        }

        // Bottom wall
        for (int j = minc + 1; j <= maxc; j++) {
            arr[maxr][j] = oned[idx++];
        }

        // Right wall
        for (int i = maxr - 1; i >= minr; i--) {
            arr[i][maxc] = oned[idx++];
        }

        // Top wall
        for (int j = maxc - 1; j >= minc + 1; j--) {
            arr[minr][j] = oned[idx++];
        }
    }

    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0) {
            r += oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] arr, int li, int ri) {
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void display(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}












