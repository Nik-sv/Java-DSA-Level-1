package String;

import java.util.Scanner;

public class Print_all_Palindromic_Substrings {


    public static boolean isPalindrome(String s){
        int i = 0;  // i ko rakha shuru mai 0 par
        int j = s.length() - 1;  // j ko ek dam last pe bejha
        while (i <= j) {  // agar i ya tho barabar hai j ke ya tho chota hai j se
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);


            // agar barabar hai tho i badhiye aur j hataiye aur agar barabar nahi hai tho palindrome nahi hai
            if ( ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true; // tho aap true return kar dho

    }





   public static void solution(String s){
       for (int i = 0; i < s.length(); i++) {
           for (int j = i + 1; j <= s.length(); j++) {
               String ss = s.substring(i , j);
               if (isPalindrome(ss) == true) {
                   System.out.println(ss);
               }
           }
       }

   }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);

    }
}
