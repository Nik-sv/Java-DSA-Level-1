//package Recursion;
//
//import java.util.*;
//import java.io.*;
//
//public class Print_Encodings {
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        printEncodings(str, "");
//    }
//
//    public static void printEncodings(String ques, String asf) { // asf = answersofar
//
//        if (ques.length() == 0) {
//            System.out.println(asf);
//            return;
//        } else if (ques.length() == 1) {
//            char ch = ques.charAt(0);
//            if (ch == '0') {   // agar ek hi length hai aur 0 hai tho aap kuch nahi karsakte
//                return;
//            } else if () {  // else agar koi aur code hai tho uske currosponding character print kardege
//                int chv = ch - '0';  // chv = character ki jo value hai
//                char code = (char) ('a' + chv - 1); // aur isse baracket lagana nahi formally bolege typecast karna padega// chv = 1 aur 1 mai - 1 = 0 aur a mai 0 add hoga tho hame a milega -> logic   // jab bhi char integer k sath add hote hai who khud bhi integar bana jate hai so isse bacchane k liye ham inhe closed bracket k andar likhege
//                System.out.println(asf + code);   // ki do length hai tho aage kuch call nahi hai
//            } else{
//                char ch = ques.charAt(0);
//                String roq = ques.substring(1);
//
//
//                if (ch == '0') {   // agar ek hi length hai aur 0 hai tho aap kuch nahi karsakte
//                    return;
//                } else if {  // else agar koi aur code hai tho uske currosponding character print kardege
//                    int chv = ch - '0';  // chv = character ki jo value hai
//                    char code = (char) ('a' + chv - 1); // aur isse baracket lagana nahi formally bolege typecast karna padega// chv = 1 aur 1 mai - 1 = 0 aur a mai 0 add hoga tho hame a milega -> logic   // jab bhi char integer k sath add hote hai who khud bhi integar bana jate hai so isse bacchane k liye ham inhe closed bracket k andar likhege
//                    printEncodings(roq, asf + code);
//                }
//                String ch12 = ques.substring(0, 2);
//                String roq12 = ques.substring(2);
//
//                // Ab jo character 12 apne nikale hai unhe aap integer mai convert karlo
//                int ch12v = Integer.parseInt(ch12);
//                // a aage kaam tabhi hoga jab jitne bhi character nikaale hai who less then or equal to 26 honge
//                if (ch12v <= 26) {
//                    char code = (char) ('a' + ch12v - 1);    // ch12v matalab character 12 ki value
//                    printEncodings(roq12, asf + code);
//                }
//            }
//
//
//        }
//    }
//}















// Correct version


//package Recursion;
//
//import java.util.*;
//
//public class Print_Encodings {
//
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        sc.close(); // Close Scanner to avoid memory leaks
//        printEncodings(str, "");
//    }
//
//    public static void printEncodings(String ques, String asf) {
//        if (ques.length() == 0) {
//            System.out.println(asf);
//            return;
//        } else if (ques.length() == 1) {
//            char ch = ques.charAt(0);
//            if (ch == '0') { // If only one character is '0', no valid encoding exists
//                return;
//            } else {
//                int chv = ch - '0';
//                char code = (char) ('a' + chv - 1);
//                System.out.println(asf + code);
//            }
//            return;
//        }
//
//        // First character encoding
//        char ch = ques.charAt(0);
//        String roq = ques.substring(1);
//
//        if (ch != '0') {  // Skip cases where first character is '0'
//            int chv = ch - '0';
//            char code = (char) ('a' + chv - 1);
//            printEncodings(roq, asf + code);
//        }
//
//        // Two-character encoding
//        String ch12 = ques.substring(0, 2);
//        String roq12 = ques.substring(2);
//
//        int ch12v = Integer.parseInt(ch12);
//        if (ch12v <= 26) {
//            char code = (char) ('a' + ch12v - 1);
//            printEncodings(roq12, asf + code);
//        }
//    }
//}







//  with comments


package Recursion;

import java.util.*;

public class Print_Encodings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // Take input string from the user (should contain only numbers)
        sc.close();  // Close Scanner to avoid memory leak
        printEncodings(str, "");  // Call the recursive function
    }

    public static void printEncodings(String ques, String asf) {
        // **Base Case: If the input string is empty, print the accumulated result**
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        // **If only one character is left in the string**
        else if (ques.length() == 1) {
            char ch = ques.charAt(0);  // Extract the first character
            if (ch == '0') {
                // If the character is '0', no valid encoding exists, so return
                return;
            } else {
                int chv = ch - '0';  // Convert the character to its numeric value
                char code = (char) ('a' + chv - 1);  // Map the numeric value to a corresponding alphabet
                System.out.println(asf + code);  // Print the final encoding
            }
            return;  // No further recursive calls needed
        }

        // **If the string length is 2 or more**

        // **Step 1: Encoding using the first character**
        char ch = ques.charAt(0);  // Extract the first character
        String roq = ques.substring(1);  // Extract the remaining string

        if (ch != '0') {  // If the first character is not '0', it can be encoded
            int chv = ch - '0';  // Convert character to its numeric value
            char code = (char) ('a' + chv - 1);  // Map the numeric value to a letter
            printEncodings(roq, asf + code);  // Recursive call for the remaining string
        }

        // **Step 2: Encoding using the first two characters**
        String ch12 = ques.substring(0, 2);  // Extract the first two characters
        String roq12 = ques.substring(2);  // Extract the remaining string

        int ch12v = Integer.parseInt(ch12);  // Convert the first two characters to an integer
        if (ch12v <= 26) {  // If the integer value is between 1 and 26, it is valid
            char code = (char) ('a' + ch12v - 1);  // Map it to the corresponding alphabet
            printEncodings(roq12, asf + code);  // Recursive call for the remaining string
        }
    }
}
