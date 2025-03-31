//package Recursion;
//
//import java.util.*;
//import java.io.*;
//
//public class Get_Stairs_Path {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<String> paths = getStairPaths(n);
//        System.out.println(paths);
//    }
//
//    public static ArrayList<String> getStairPaths(int n) {
//
//        // BaseCase => Positive basecase => 0 and NegativeBaseCase = -1 , -2 etc
//        if (n == 0){
//            ArrayList<String> bres = new ArrayList<>();   // agar n == 0 hai tho ek baseresult bres banao aur usme ek blank daal dho  , ek rasta hai kuch mat karo
//            bres.add("");
//            return bres;
//        } else if (n < 0) {
//            ArrayList<String> bres = new ArrayList<>();  // jaba negative wala path banega tab aap Arraylist khali rakege aur usme kuch bhi add nahi karege
//            return bres;
//        }
//
//        ArrayList<String> paths1 = getStairPaths(n  - 1);  // ye hamara faith hai ki ye line hame n-1 se 0 k saare path nikaal kar dedegi
//        ArrayList<String> paths2 = getStairPaths(n - 2);  // ye fir hamara faith hai ki n - 2 se 0 k saare paths nikaal kar de dega
//        ArrayList<String> paths3 = getStairPaths(n  - 3);  // ye hamara faith hai ki ye line hame n-3 se 0 k saare path nikaal kar dedegi
//
//        ArrayList<String> paths = getStairPaths(n - 0);  // Hame n - 0 k saare paths chiye
//
//
//        for (String path: paths1){   // agar tum mujhe 6 - 0 k ssare path de dho aur kaho ki mujhe tum 7 - 0 k saare patha laa k dho tho mai unke muu pe 1 laga duga
//            paths.add(1 + path);
//        }
//
//        for (String path: paths2){   // agar tum mujhe 5 - 0 k ssare path de dho aur kaho ki mujhe tum 7 - 0 k saare patha laa k dho tho mai unke muu pe 2 laga duga
//            paths.add(2 + path);
//        }
//
//        for (String path: paths3){   // agar tum mujhe 4 - 0 k ssare path de dho aur kaho ki mujhe tum 7 - 0 k saare patha laa k dho tho mai unke muu pe 3 laga duga
//            paths.add(3 + path);
//        }
//
//        return paths;
//
//
//
//    }
//}














package Recursion;

import java.util.*;

public class Get_Stairs_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add("1" + path);
        }

        for (String path : paths2) {
            paths.add("2" + path);
        }

        for (String path : paths3) {
            paths.add("3" + path);
        }

        return paths;
    }
}

