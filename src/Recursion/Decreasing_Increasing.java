package Recursion;

import java.util.Scanner;

public class Decreasing_Increasing {
    public static void main(String[] args) {
        // Write your code hear
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        pdi(n);
    }

    public static void pdi (int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }
}
