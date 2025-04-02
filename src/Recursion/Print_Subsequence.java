//package Recursion;
//
//import java.util.Scanner;
//
//public class Print_Subsequence {
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        printSS(str, "");  // SS -> stands for SubSequence   // Starting may mai 2 mai divide karuga question and answer aur string form mai question ko  mai recive karuga
//    }
//
//    public static void printSS(String ques, String ans) {
//
//        // BaseCase
//
//        if (ques.length() == 0) {                               // jab question ki length 0 ho jayegi tho tab kahoge ab kya quetion ki length ho gai 0 tho ab return karna hoga
//            System.out.println(ans);                                   // lakin usse pahelay aap answer ko print kar le
//            return;                              // phir return karna hoga
//        }
//
//        char ch = ques.charAt(0);    // Question ko mai split karuga
//        String roq = ques.substring(1);                              // Aur baki ki string dedho
//
//        printSS(roq, ans + "");  // ahelay alag kiya phir ans k andar 1 question ki no * or cross daal rahe hai   // rest of the question pass kiya aur answer k andar character add nahi kiya  ,, pahela character pass kar rahe hai kya garuenty hai bez ham pahelay ko chod kar baad k sab pass kar rahe hai
//        printSS(roq, ans + ch);   // aur yaha pe yes daal rahe hai
//    }
//
//
//}









package Recursion;

import java.util.Scanner;

public class Print_Subsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str, "");  // SS -> stands for SubSequence
    }

    /**
     * Recursive function to generate and print all subsequences
     * @param ques: The remaining string (question part)
     * @param ans: The generated subsequence so far (answer part)
     */
    public static void printSS(String ques, String ans) {

        // Base Case: When the input string is empty, print the accumulated answer
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Extract the first character
        char ch = ques.charAt(0);
        // Extract the remaining substring
        String roq = ques.substring(1);

        // Recursively call for two cases:
        // 1. Exclude the current character
        printSS(roq, ans);
        // 2. Include the current character
        printSS(roq, ans + ch);
    }
}












