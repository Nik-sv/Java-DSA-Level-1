package Recursion;

import java.util.Scanner;

public class Display_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt();
        }

        displayArr(arr , 0);
    }

    // Expectation -> ye hai ki index se end tak sab print kar de
    // Faith -> ye rakhna hai ki idx + 1 se end tak print karna janta hai
    public static void displayArr(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }
}
