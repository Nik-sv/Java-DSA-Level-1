package Recursion;

import java.util.*;
import java.io.*;

public class Target_Sum_Subsets {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0,  tar);
    }

    // set is a subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {

        // BaseCase
        if (idx == arr.length) { // jis din array pahuchega ye karte karte array.length tak = matlab khatam
              if (sos == tar) {                 // par ham yaha par bhi sochege ki jo sum of set hai kya who given target k barabar hai
                  System.out.println(set + ".");  // tho jo ham se bana kar laye hai na usme  fullstop laga kar print kardege
              }
            return;
        }

        printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);   // mai set msi aa sakta hn yes wala option hai
        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
    }

}
