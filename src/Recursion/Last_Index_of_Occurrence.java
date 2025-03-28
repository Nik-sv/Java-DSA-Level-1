package Recursion;

import java.util.Scanner;

public class Last_Index_of_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();   // ye hame search karna hai tho ye bhi hamne recive kiya
        int li = lastIndex(arr, 0, x);
        System.out.println(li);
    }

    public static int lastIndex(int[] arr, int idx, int x){


        // Base Case

        if (idx == arr.length){
            return -1;
        }


        int liisa = lastIndex(arr, idx + 1,  x);        // ye check karta hai aur x lasttime jaha dikahi deta hai return kardeta                         // liisa = last index in smaller array
        if (liisa == -1){  // team ne kaha hamse nahi hua
            if(arr[idx] == x){  // thik hai mai kar ke dekh leta hn
                return idx;     // agar tum barabar nikle tho kahoge hogaya hogaya
                 } else {    // ab iswale else ka matlab samjho na tho team se hua na tum dhud paaye tho phir kahi mila hi nahi
                     return -1;
                 }
        }  else {   // agar liisa mai -1 value hoti matlab aapke piche mil gaya hota matlab team ne kaam kar diya hai tho ab aap capable ho bhi tho bhi koi farak  nahi padta hai
             return liisa;
        }
    }
}
