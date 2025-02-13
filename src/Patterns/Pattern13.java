
package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        // Scanner object to take user input for number of rows
        Scanner sc = new Scanner(System.in);

        // Input number of rows (n) for Pascal's Triangle
        int n = sc.nextInt();

        // Outer loop to iterate through each row
        for (int i = 0; i < n; i++) {
            // 'icj' stores the value of the current element in the row (initially 1 for first element)
            int icj = 1;

            // Inner loop to print elements in the current row (i-th row)
            for (int j = 0; j <= i; j++) {
                // Print the current combination value (Pascal's triangle element)
                System.out.print(icj + "\t");

                // Calculate the next combination value using the formula:
                // C(i, j+1) = C(i, j) * (i - j) / (j + 1)
                // This formula avoids calculating factorials explicitly, making it efficient.
                int icjp1 = icj * (i - j) / (j + 1);

                // Update icj for the next iteration
                icj = icjp1;
            }

            // After completing the current row, print a new line for the next row
            System.out.println();
        }
    }
}
