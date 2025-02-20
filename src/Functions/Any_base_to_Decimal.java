package Functions;

import java.util.Scanner;

public class Any_base_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = getValueIndecimal(n , b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n , int b){
        // Write your code
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
