package Recursion;

import java.util.Scanner;

public class Print_Zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz (int n){



        // Eulars path








        if ( n == 0){
            return;
        }

        System.out.println("Pre" + n);  // pre
        pzz(n - 1);
        System.out.println("In" + n);  // In
        pzz(n - 1);
        System.out.println("Post" + n);  // Post


//        if ( n == 0){
//            return;
//        }
//
//        System.out.print(n + " ");  // Pre
//        pzz(n - 1);
//        System.out.print(n + " ");  // In
//        pzz(n - 1);
//        System.out.print(n + " ");  // Post
    }
}
