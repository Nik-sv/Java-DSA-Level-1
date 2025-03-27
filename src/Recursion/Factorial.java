package Recursion;

import java.io.*;
import java.util.*;

public class Factorial {
    public static void main(String[] args) throws Exception {
        // write your code hear
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int f = factorial(n);
            System.out.println(f);

    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }

        int fnm1 = factorial( n - 1);
        int fn = n * fnm1;
        return fn;
    }
}
