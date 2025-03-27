package Recursion;

import java.util.Scanner;

public class Display_ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        displayArrReverse(arr , 0);

    }

    public static void displayArrReverse(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }

            displayArrReverse(arr , idx + 1);   // Faith
            System.out.println(arr[idx]);           // Expectation
    }
}
