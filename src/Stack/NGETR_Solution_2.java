//package Stack;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class NGETR_Solution_2 {
//    public static void display(int[] a) {
//        StringBuilder sb = new StringBuilder();
//        for (int val : a) {
//            sb.append(val).append("\n");
//        }
//        System.out.println(sb);
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = Integer.parseInt(br.readLine());
//        }
//
//        int[] nge = solve(a);
//        display(nge);
//    }
//
//    public static int[] solve(int[] arr) {
//        int[] nge = new int[arr.length];
//        Stack<Integer> st = new Stack<>(); // Stack stores indices, not values
//
//        st.push(0);
//        for (int i = 0; i < arr.length; i++) {
//            while (st.size() > 0 && arr[i] > arr[st.peek()]){
//                int pos = st.peek();
//                nge[pos] = arr[i];
//                st.pop();
//            }
//
//            st.push(i);
//        }
//
//        while (st.size() > 0){
//            int pos = st.peek();
//            arr[pos] = -1;
//        }
//
//    }
//
//}





















package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NGETR_Solution_2 {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int val : a) {
            sb.append(val).append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>(); // Stack stores indices, not values

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int pos = st.pop();
                nge[pos] = arr[i];
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            nge[st.pop()] = -1;
        }

        return nge;
    }
}

