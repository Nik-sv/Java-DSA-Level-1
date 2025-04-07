package String;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s);
//        System.out.println(s.length());

//        String s = "abcd";
//        System.out.println(s.substring(0,2));
//        System.out.println(s.substring(1));


        String s1 = "abcd";
        for (int i = 0; i < s1.length(); i++) {   // i yaha pe 0 se lassthen length = i = [ 0 to length - 1 ] 
            for (int j = i + 1; j <= s1.length(); j++) {
                System.out.println(s1.substring(i,j));
            }
               
        }

        // So ab aapko substring function bhi samaj aagaya aur print Substring bhi samaj aagaya
         // Substring mai main main baat kya hai ki ek start index hoga aur who end tak jayega par end ko print nahi karega  => aur agar ek hi parameter doge to start se end tak sab print kar dega  aur agar  0 , 0 or 1 , 1 doge tho blank print karega aur 2 , 1 likh dhoge tho error aa jayegi



    }
}
