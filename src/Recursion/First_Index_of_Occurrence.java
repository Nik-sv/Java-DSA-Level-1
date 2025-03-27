//package Recursion;
//
//import java.util.Scanner;
//
//public class First_Index_of_Occurrence {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tn = sc.nextInt();
//        int n  = sc.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int d = sc.nextInt();
//        int fi = firstIndex(arr, 0 , d);
//        System.out.println(fi);
//    }
//    public static int firstIndex(int[] arr, int idx, int x) {
//
//
//        // Base Case
//        if (idx == arr.length){
//            return - 1;
//        }
//
//
//         // Badhiya ye hai tum pahelay hi compare kar lete
//
//        if (arr[idx] == x){
//            return idx;
//        } else {
//            int fiisa = firstIndex(arr, idx + 1, x);   // fiisa = first index in small array
//            return fiisa;
//        }
//
//
//
//       //  int fiisa = firstIndex(arr, idx + 1, x);   // fiisa = first index in small array
//
//
//        // ye baad mai compare karna badhiya nahi hai
//        //        if (arr[idx] == x){
//        //            return idx;
//        //        } else {
//        //            return fiisa;
//        //        }
//
//
//    }
//}
//
//
//






package Recursion;

import java.util.Scanner;

public class First_Index_of_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tn = sc.nextInt(); // tn variable input le raha hai, lekin use nahi ho raha
        int n  = sc.nextInt();
        int[] arr = new int[n];

        // Array input lena
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt(); // Search element
        sc.close(); // Scanner close kar diya

        // First Index find karna
        int fi = firstIndex(arr, 0, d);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        // Base Case: Agar pura array traverse ho gaya aur element nahi mila
        if (idx == arr.length) {
            return -1;
        }

        // Pehle hi check karna best hai
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = firstIndex(arr, idx + 1, x); // fiisa = first index in small array
            return fiisa;
        }
    }
}


