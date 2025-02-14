package Functions;

import java.util.Scanner;

public class Decimal_to_any_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInBase(n , b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n , int b) {

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
}
