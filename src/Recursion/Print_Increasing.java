//package Recursion;
//
//import java.util.Scanner;
//
//public class Print_Increasing {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        printIncreasing( 1 , n);
//    }
//
//    public static void printIncreasing(int current , int n) {
//        if ( current > n) {  // Base case (jab current n se bada ho jaye, tho stop)
//            return;
//        }
//
//        System.out.println(current);     // Pahle print karege
//       System.out.println(current + 1, n); // Phir Recursion call hoga
//    }
//}





//package Recursion;
//
//import java.util.Scanner;
//
//public class Print_Increasing {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.close();
//        printIncreasing(1, n); // Recursion ka start
//    }
//
//    public static void printIncreasing(int current, int n) {
//        if (current > n) { // Base case (jab current n se bada ho jaye, toh stop)
//            return;
//        }
//        System.out.println(current); // Pehle print karenge
//        printIncreasing(current + 1, n); // Phir recursion call hoga
//    }
//}
//



package Recursion;

import java.util.Scanner;

public class Print_Increasing {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        printIncreasing(n); // Recursion ka start
    }

    public static void printIncreasing( int n) {
       if (n == 0){// Base case (jab current n se bada ho jaye, toh stop)
           return;
       }

       printIncreasing(n - 1); // print karenge Phir recursion call hoga
        System.out.println(n);// print karenge
    }
}

