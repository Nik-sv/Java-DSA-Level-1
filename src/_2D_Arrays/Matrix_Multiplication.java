package _2D_Arrays;
//
//import java.util.Scanner;
//
//public class Matrix_Multiplication {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int r1 = sc.nextInt();
//        int c1 = sc.nextInt();
//
//        int[][] one = new int[r1][c1];
//        for (int i = 0; i < one.length; i++) {
//            for (int j = 0; j < one[i].length; j++) {
//                one[i][j] = sc.nextInt();
//            }
//        }
//
//
//        int r2 = sc.nextInt();
//        int c2 = sc.nextInt();
//
//        int[][] two = new int[r2][c2];
//        for (int i = 0; i < two.length; i++) {
//            for (int j = 0; j < two[i].length; j++) {
//                two[i][j] = sc.nextInt();
//            }
//        }
//
//
//
//        // imp
//
//        if (c1 != r2) {
//            System.out.println("Invalid Input");
//            return;
//        }
//
//        // Otherwise ham ek product naam ki matrix banayege
//
//        int [][] prd = new int[r1][c2];
//        for (int i = 0; i < prd.length; i++) {
//            for (int j = 0; j < prd[i].length; j++) {
//                for (int k = 0; k < c1; k++){
//                    prd[i][j] +=  one[i][k] * two[k][j];
//                }
//            }
//        }
//
//
//        // dubara loop laga kar print karte rahege
//
//        for (int i = 0; i < prd.length; i++) {
//            for (int j = 0; j < prd[i].length; j++) {
//                System.out.print(prd[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//
//
//    }
//}




















import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for the first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns for the second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Invalid input: Column of first matrix must equal row of second.");
            return;
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                // main logic
                for (int k = 0; k < c1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}







