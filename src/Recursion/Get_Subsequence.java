//package Recursion;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Get_Subsequence {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();  // String input lene k liye str.next hota hai
//        ArrayList<String> res = gss(str);    // gss = getsubsequence
//        System.out.println(res);
//    }
//     // bc -> [-- , -c , b- , bc]
//    // abc -> [--- , --c , -b- , -bc , a-- , a-c , ab- , abc]
//    public static ArrayList<String> gss(String str) {
//         // BaseCase
//        if (str.length() == 0){
//           ArrayList<String> bres = new ArrayList<>();   // bres = baseresult
//           bres.add("");   // ek chhez add ki jo ki blank hai
//           return bres;
//        }
//
//
//        char ch = str.charAt(0);    // a //abc ka bhai maine pahela character alag karliya
//        String ros = str.substring(1);  // bc // tho yaha bc alag kar diya matlab a alag aur bc alag
//        ArrayList<String> rres = gss(ros);    // rres = result //   [-- , -c , b- , bc]                       //   rres = recursion result    ,, Aur ye main e lagaya call
//
//        ArrayList<String> mres = new ArrayList<>();   // mres = myresult
//        for (String rstr: rres ){
//            mres.add("" + rstr);
//            mres.add(ch + rstr);   // ham isko add kardege a hamara chracter mai pada hai
//        }
//
//        // Order alag laane k liye
//
////        for (String rstr: rres ){
////            mres.add("" + rstr);
////        }
////
////        for (String rstr: rres){
////            mres.add(ch + rstr);   // ham isko add kardege a hamara chracter mai pada hai
////
////        }
//
//        return mres;
//    }
//}









package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Subsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // Input string
        ArrayList<String> res = gss(str);  // Get all subsequences
        System.out.println(res);
    }

    // Function to get all subsequences of a string
    public static ArrayList<String> gss(String str) {
        // Base Case: If string is empty, return a list with empty string
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();  // Base result
            bres.add("");  // Empty subsequence
            return bres;
        }

        char ch = str.charAt(0);  // First character
        String ros = str.substring(1);  // Rest of string

        // Recursive call to get subsequences of rest of string
        ArrayList<String> rres = gss(ros);  // Recursive result

        // My result: I will add both possibilities → without 'ch' and with 'ch'
        ArrayList<String> mres = new ArrayList<>();

        for (String rstr : rres) {
            mres.add("" + rstr);    // Without current character
            mres.add(ch + rstr);    // With current character
        }

        return mres;
    }
}












