package BASICS;

import java.util.Scanner;

public class Prime_Factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //int n2 = sc.nextInt();

        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0){
                n = n / div;
                System.out.print(div+ " ");
            }
        }

        if (n != 1) {
            System.out.print(n);
        }

    }
}
