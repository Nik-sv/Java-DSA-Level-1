//package BASICS;
//
//import java.util.Scanner;
//
//public class Rotate_a_number {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();   // n is what jisko rotate karna hai
//        int k = sc.nextInt();  // k is what jitne se rotate karna hai
//
//
//       // pahelay number of digits nikalna padega taki hame ye tho pata ho ki digits kitne hai
//        int temp = n;
//        int nod = 0;
//        while (temp > 0){
//            temp = temp/10;
//            nod++;
//        }
//
//        // Extra case
//        k = k % nod;   // ye bade numbers ko manage kar dega aur
//        if (k < 0 ){   // ye negative numbers ko manage kar dega
//            k = k + nod;
//        }
//
//
//        int div = 1;
//        int mult = 1;
//        for (int i = 0; i < nod; i++) {
//            if (i <= k) {
//                div = div * 10;
//            } else {
//                mult = mult * 10;
//            }
//        }
//
//
//        int q = n / div;
//        int r = n % div;
//
//        int rem = r * mult + q;
//        System.out.println(rem);
//
//    }
//}



















package BASICS;

import java.util.Scanner;

public class Rotate_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // Number to rotate
        int k = sc.nextInt();   // Number of rotations

        // Step 1: Count digits
        int temp = n;
        int nod = 0;
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // Step 2: Handle large and negative rotations
        k = k % nod;   // Handles cases where k > nod
        if (k < 0) {   // Handles negative k
            k = k + nod;
        }

        // Step 3: Calculate divisor and multiplier
        int div = (int) Math.pow(10, k);
        int mult = (int) Math.pow(10, nod - k);

        // Step 4: Extract rotated parts
        int q = n / div;
        int r = n % div;

        // Step 5: Combine the rotated parts
        int rem = r * mult + q;
        System.out.println(rem);
    }
}
