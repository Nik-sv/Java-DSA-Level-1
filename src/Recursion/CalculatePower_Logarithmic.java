package Recursion;

// Ye Question thoda sa Introduction kara deta hai time complexity k sath


import java.util.Scanner;

public class CalculatePower_Logarithmic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x , n);
        System.out.println(xn);
    }

    public static int power(int x, int n){

        // Base Case
        if (n == 0){
            return 1;
        }

        /* Lograthmic Case */

        int xpnb2 = power(x , n / 2);
        int xn = xpnb2 * xpnb2;

        if (n % 2 == 1){
            xn = xn * x;
        }

        return xn;
    }
}










