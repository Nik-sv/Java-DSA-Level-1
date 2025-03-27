package Recursion;

import java.util.Scanner;

public class Array_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = maxOfArray(arr , 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
         // Base Case
        if (idx == arr.length - 1) {
             return arr[idx];    // arr[idx] kahega ki mere se bada tho yaha koi hai hi nahi
        }
        // misa = max of smallest array
        int misa = maxOfArray(arr , idx + 1);
        if (misa > arr[idx]){
            return misa;
        } else {
            return arr[idx];
        }
    }
}
