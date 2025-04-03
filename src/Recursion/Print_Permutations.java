package Recursion;

import java.util.*;
import java.io.*;

public class Print_Permutations {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String asf) {


        // BaseCase -> question khatam ho jaye tho return 0
        if (ques.length() == 0){
            System.out.println(asf);
            return;
        }


        for (int i = 0; i < ques.length(); i++) {
             char ch = ques.charAt(i);   // character kaise milega
             String qlpart = ques.substring(0 , i);   // question ka left part = qlpart -> left wala milnek liye 0 , i tak matlab jo i hai usko chodkar sab mil jayega
             String qrpart = ques.substring(i+1);   // question ka right part = qrpart -> so i + 1 se pura last tak miljayega
             String roq = qlpart + qrpart;  // rest of the question
            printPermutations(roq, asf + ch);
        }
    }
}









