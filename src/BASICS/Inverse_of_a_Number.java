package BASICS;

import java.util.Scanner;

public class Inverse_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

  // Digit ko invert karane ka program
        int inv = 0;
        int op = 1;
        while (n != 0){
            int od = n % 10;
            int id = op;
            int ip = od;

           // make change to inv using ip and id
            inv = inv + id * (int)Math.pow(10, ip - 1);

            n = n / 10;
            op++;
        }
        System.out.println(inv);
    }
}
