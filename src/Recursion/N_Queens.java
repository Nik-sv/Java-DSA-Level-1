package Recursion;

import java.util.Scanner;

public class N_Queens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
        sc.close();
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        // Base Case
        if (row == chess.length) {
            System.out.println(qsf);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isItaSafePlaceForQueen(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0; // Backtracking step
            }
        }
    }

    public static boolean isItaSafePlaceForQueen(int[][] chess, int row, int col) {
        // Checking vertically above
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == 1) {
                return false;
            }
        }

        // Checking left diagonal (↖)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // Checking right diagonal (↗)
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
