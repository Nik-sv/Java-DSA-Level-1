package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {    // magic jitne baar hum uppar wale loop ko chalayege untne hi baar who andar har kine mai utne hi * print kar dega
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
