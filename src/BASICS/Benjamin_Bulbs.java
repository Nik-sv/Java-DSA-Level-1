package BASICS;

import java.util.Scanner;

public class Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i * i< n; i++) {
            System.out.println(i * i);
        }

    }
}
