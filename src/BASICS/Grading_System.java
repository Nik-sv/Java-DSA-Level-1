package BASICS;

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();

        if (Marks > 90) {
            System.out.println("Excellent");
        } else if (Marks >= 80 ) {
            System.out.println("Good");
        } else if (Marks >= 70) {
            System.out.println("Fair");
        } else if (Marks >= 60) {
            System.out.println("Meet Expectations");
        } else {
            System.out.println("Below par");
        }
    }
}
