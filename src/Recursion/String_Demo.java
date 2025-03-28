package Recursion;

public class String_Demo {
    public static void main(String[] args) {
        String str = "hello";  // declare kaise kare
        System.out.println(str);  // print kaise kare
       // char ch = str.charAt(0);
       // System.out.println(ch);

        for (int i = 0; i < str.length(); i++) {   // length() -> function hai jisse puri length pata chal jati hai
            char ch = str.charAt(i);   // Ek ek character kaise nikaale
            System.out.println(ch);
        }

        String ss = str.substring(1, 4);      // string ko tod kar kaise le aur isme aapne 1,3 bola na tho 2 tak hi dega 3 ko leta nahi hai
        System.out.println(ss);
        String sp = str.substring(1, 5);  // ha ye likh sakte hai (1, 6) nahi likh sakte hai
        System.out.println(sp);
        // Ek last variation hai ki agar aap ek hi parameter dege tho aapko who uske aage k saare last tak print kar k dedega
        String pp = str.substring(2);
        System.out.println(pp);
    }
}
