package Recursion;

import java.io.*;
import java.util.*;

public class Get_Keypad_Combination {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    // Global array ko ham static keyword se define karte hai

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mnop", "qrst", "tu", "vwx", "yz",  };
    public static ArrayList<String> getKPC(String str) {

      // BaseCase => Tho ye basecase wali baat aajib si ye aati rahegi


        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }




         // 678
        char ch = str.charAt(0);  // 6
        String ros = str.substring(1);  // 78

        ArrayList<String> rres = getKPC(ros);   // mai umeed kar raha hn 678 k words aagaye = 6 words of 78
        ArrayList<String> mres = new ArrayList<>();  // yaha mres mai mujhe return karne hai 24 words of 678 = 24 words for 678

        // tho kya kiya jaye ki hamare ban jaaye 24 words

        // tho pqrs ko in 6 k sath alag-alag intract karaya jaye tab banegi baat 


        String codeforch = codes[ch - '0'];   // exact 6 pass karne k liye mujhe isse asscii vale se real 6 banana padega jiske liye mai '0' = 48 se minus kar duga = '6' - '0' = 6 , 54 - 48 = 6
        for (int i = 0; i < codeforch.length(); i++) {
            char chcode = codeforch.charAt(i);
            for (String rstr: rres) {
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }
}
