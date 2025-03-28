package Recursion;

import java.util.*;
import java.io.*;

public class All_Indices_in_Array {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndicies(arr, x, 0, 0);

        if (iarr.length == 0){
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndicies(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length){
            return new int[fsf];
        }
        if (arr[idx] == x){
            int[] iarr =  allIndicies(arr, x, idx + 1, fsf + 1);   // Agar barabar hai tho dono badhege aur barabar nahi hai tho else pe , iarr = index of an array
            iarr[fsf] = idx;                               // jaha barabar hai waha u kau return nahi karna hai pahelay iarr mai fsf position k uppar index daalna hai phir i array return karna hai
            return iarr;
        } else {
          int[] iarr =   allIndicies(arr, x, idx + 1, fsf );  // ki idx + 1 hoga par fsf nahi badhega
          return iarr;   // iss case mai bina kuch kare i return karna hai
        }



    }
}
