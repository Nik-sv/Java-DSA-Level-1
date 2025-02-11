package BASICS;

import java.util.Scanner;

public class Digits_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int node = 0;
        int temp = n;

        while (temp != 0){
            temp = temp/10;
            node++;
        }

        int div = (int)Math.pow(10 , node - 1);

        while (div != 0){       // n nahi likna hai divisor ki jagahe nahi tho gadbad hogi aur number 1000 ya 7600 input lene par sahi se print nahi karega
           int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }
    }
}
