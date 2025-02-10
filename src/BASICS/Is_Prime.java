package BASICS;

import java.util.Scanner;

public class Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if(n % div == 0 ){
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }


    }
}
