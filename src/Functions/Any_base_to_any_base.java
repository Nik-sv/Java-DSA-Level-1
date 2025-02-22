package Functions;

import java.awt.*;
import java.util.Scanner;

public class Any_base_to_any_base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();


        int d = getValue(n , b1 , b2);
        System.out.println(d);


    }

    public static int getValue(int n , int b1 , int b2){
       int dec = anybasetodecimal(n , b1);
       int dn = decimaltoanybase(dec , b2);

       return dn;
    }


    // Yaha pe humne pichala pice bana liya tha aur pichala bana k aage badte hue hum uska use kaise kar sakte hai humne yaha pe dekha hai



    public static int decimaltoanybase(int n , int b ){
        int rv = 0;

        int p = 1;
        while (n > 0){
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }

        return rv;
    }

    public static int anybasetodecimal(int n , int b){
        // write your code hear

        int rv = 0;

        int p = 1;
        while (n > 0){
            int dig = n % 10;
            n = n / 10;

            rv += dig * p;
            p = p * b;

        }

        return rv;
    }
}
