//package Recursion;
//
//import java.util.Scanner;
//
//public class Print_Decreasing {
//    public static void main(String[] args) throws Exception {
//        // Write your code hear
//        Scanner sc = new Scanner(System.in);  //  accha bhiya high level thinking tho ho gai ab karege low level thinking
//        int n = sc.nextInt();
//        printDecreasing(n);
//    }
//
//    public static void printDecreasing(int n ){
//        if (n == 0) {  // Base Case
//            return;  // function wipe out hoga because dono fir se do-do baar chal chuke the
//        }
//        System.out.println(n);   // pahelay n print kiya fir
//        printDecreasing(n - 1);       //  n- 1 ko invoke kar diya
//    }
//}




package Recursion;

import java.util.Scanner;

public class Print_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read input
        sc.close();  // Close the scanner
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if (n == 0) {  // Base Case: Stop when n reaches 0
            return;
        }
        System.out.println(n);  // Print current number
        printDecreasing(n - 1); // Recursive call with (n-1)
    }
}
