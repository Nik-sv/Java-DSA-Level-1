//package Stack;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//import java.util.Stack;
//
//public class Merge_Overlapping_Intervals {
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String sc = br.readLine();
//
//        int n = 0;
//        int v1;
//        int v2;
//        int iv1;
//        int iv2;
//
//
//        Stack<Integer> st = new Stack<>();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (v1 && v2 == iv1 && iv2){
//                    System.out.println(+ v1 + "to" + iv2 +);
//                } else {
//                    System.out.println("None");
//                }
//            }
//
//        }
//
//    }
//}    ==> This code is written by me



//package Stack;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class Merge_Overlapping_Intervals {
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][2];
//
//        for (int j = 0; j < n; j++) {
//            String line = br.readLine();
//            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
//            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
//        }
//
//        mergeOverlappingIntervals(arr);
//    }
//
//    public static void mergeOverlappingIntervals(int[][] arr) {
//        // merge overLapping intervals and print in increasing order of start to
//        Pair[] pairs = new Pair[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            pairs[i] = new Pair(arr[i][0] , arr[i][1]);
//        }
//        Arrays.sort(pairs);
//        Stack<Pair> st = new Stack<>();
//        for (int i = 0; i < pairs.length; i++) {
//              if (i == 0){
//                  st.push(pairs[i]);
//              } else {
//                  Pair top = st.peek();
//
//                  if (pairs[i].st > top.et){
//                      st.push(pairs[i]);
//                  } else {
//                      top.et = Math.max(top.et, pairs[i].et);
//                  }
//              }
//        }
//
//        Stack<Pair> rs = new Stack<>();
//        while (st.size() > 0){
//            rs.push(st.pop());
//        }
//
//        while (rs.size() > 0){
//            Pair p = rs.pop();
//            System.out.println(p.st + " " + p.et);
//        }
//    }
//
//    public static class Pair {
//        int st;
//        int et;
//
//        Pair(int st, int et){
//            this.st = st;
//            this.et = et;
//        }
//
//        // this > other return +ve
//        // this = other return 0
//        // this < other return -ve
//
//        public int compareTo(Pair other){
//            if (this.st != other.st){
//                return this.st - other.st;
//            } else {
//                return this.et - other.et;
//            }
//        }
//
//
//
//    }
//}
//
//























package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Merge_Overlapping_Intervals {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        // Read intervals properly (start and end values)
        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            arr[j][0] = Integer.parseInt(parts[0]);
            arr[j][1] = Integer.parseInt(parts[1]);  // Fix: assign to arr[j][1]
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // Convert array to Pair objects
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        // Sort the pairs based on start time (and then end time)
        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();
                // If the current pair does not overlap with the top of the stack, push it
                if (pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } else {
                    // Overlapping intervals: merge them by updating the end time
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        // Since intervals need to be printed in increasing order of start time,
        // we can use another stack to reverse the order.
        Stack<Pair> rs = new Stack<>();
        while (!st.isEmpty()){
            rs.push(st.pop());
        }

        while (!rs.isEmpty()){
            Pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    // Modify Pair class to implement Comparable interface
    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        // Overriding compareTo to sort by start time; if equal, sort by end time
        public int compareTo(Pair other) {
            if (this.st != other.st) {
                return this.st - other.st;
            } else {
                return this.et - other.et;
            }
        }
    }
}

















