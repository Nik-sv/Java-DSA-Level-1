package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

         int sp = n - 1;
         int st = 1;
        for (int i = 1; i <= n; i++) {
          //  System.out.println(sp + "," + st);



            for (int j = 1; j <= sp; j++) {    // ye wala loop paheli row mai 4 space print karega aur phir dusri row mai 3 ---1
                System.out.print(" ");
            }


            for (int j = 1; j <= st; j++) {    // ye wala loop paheli row mai 1 star print karega aur phir dusri row mai 2 ---5
                System.out.print("*");
            }



            sp--;
            st++;
            System.out.println();
        }
    }
}
