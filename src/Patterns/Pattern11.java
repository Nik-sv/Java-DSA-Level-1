package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = 1;   // yaha pe val jo hai who help karega ki har baar val ki value ko 1 se increase karega aur because of that yaha pe improvement aayegi

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {    // magic jitne baar hum uppar wale loop ko chalayege untne hi baar who andar har kine mai utne hi * print kar dega
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
