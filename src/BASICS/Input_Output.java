package BASICS;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println(" Dear " + name + " Hear is the counting " );
        for (int i = 2; i < n; i++) {
            System.out.println(i);
        }



    }
}
