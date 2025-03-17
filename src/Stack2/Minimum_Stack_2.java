//package Stack2;
//
//import java.io.*;
//import java.util.*;
//
//public class Minimum_Stack_2 {
//    public static class minimumStack2 {
//        Stack<Integer> allData;
//       int min;
//
//        // ✅ Fixed: Constructor added to initialize stacks
//        public minimumStack2() {
//            allData = new Stack<>();
//        }
//
//        int size() {
//          return allData.size();
//        }
//
//        void push(int val) {
//            if (allData.size() == 0){
//                allData.push(val);
//                min = val;
//            } else if (val >= min){
//                allData.push(val);
//            } else {   // khass kam tab karege jab value min se choti hoti hai
//                allData.push(val + val - min);   // detection , storing a fake smaller value
//                min = val;  // original value stored in min
//            }
//        }
//
//        int pop() {
//            if (size() == 0){
//                System.out.println("Stack underflow");
//                return -1;
//            } else
//                if (allData.peek() >= min){
//                    return allData.pop();
//                } else {
//                    int ov = min;   // ov = original value
//                     min = 2 * min - allData.pop();
//                     return ov;
//                }
//            }
//
//        }
//
//        int top() {
//            if (size() == 0){
//                System.out.println("Stack underflow");
//                return -1;
//            } else {
//               if (allData.peek() >= min){
//                   return allData.peek();
//               } else {
//                   return min;
//               }
//            }
//        }
//
//        int min() {
//           if (size() == 0){
//               System.out.println("Stack underflow");
//               return -1;
//           } else {
//               return min;
//           }
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // ✅ Fixed: Corrected object creation
//        minimumStack2 st = new minimumStack2();
//
//        String str;
//        while (!(str = br.readLine()).equals("quit")) {
//            if (str.startsWith("push")) {
//                int val = Integer.parseInt(str.split(" ")[1]);
//                st.push(val);
//            } else if (str.startsWith("pop")) {
//                int val = st.pop();
//                if (val != -1) {
//                    System.out.println(val);
//                }
//            } else if (str.startsWith("top")) {
//                int val = st.top();
//                if (val != -1) {
//                    System.out.println(val);
//                }
//            } else if (str.startsWith("size")) {
//                System.out.println(st.size());
//            } else if (str.startsWith("min")) {
//                int val = st.min();
//                if (val != -1) {
//                    System.out.println(val);
//                }
//            }
//        }
//    }
//}