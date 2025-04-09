//package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Wave_Traversal {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[][] arr = new int[n][m];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        // main point -> coloumn kaha se kaha tak vary karte hai that is very important  arr[0] se arr[0].length tak
//
//        for (int j = 0; j < arr[0].length; j++) {
//            // ab ek baar niche  coloumn mai aur ek baar upar ye depend kar raha hai coloumn kaisa hai
//            if (j % 2 == 0) {   // even column mai niche ki taraf jaa rahe hai -> tho loop thi hai
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.println(arr[i][j]);
//                }
//            } else {  // odd coloumn mai upar ki taraf jaa rahe tho condition mai change karna padega
//                for (int i = arr.length - 1; i >= 0; i--) {   // arr.length - 1 se start karege matlab ki akhari se aur 0 ki taraf jayege matlab i-- hoga
//                    System.out.println(arr[i][j]);
//                }
//            }
//        }
//
//    }
//}



package _2D_Arrays;

import java.util.Scanner;

public class Wave_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number of rows and columns as input
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Declare and input the elements of the 2D array
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Start the wave traversal column by column
        // Traverse each column from top to bottom if the column index is even
        // Traverse from bottom to top if the column index is odd

        for (int j = 0; j < arr[0].length; j++) {

            if (j % 2 == 0) {
                // For even columns, move from top to bottom
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                // For odd columns, move from bottom to top
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }

        // Close the scanner to prevent memory leak
        sc.close();
    }
}
