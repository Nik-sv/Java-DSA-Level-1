package BASICS;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not a prime");
            }
        }
    }

}
