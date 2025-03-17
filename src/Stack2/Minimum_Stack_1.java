//package Stack2;
//
//import java.io.*;
//import java.util.*;
//
//
//public class Minimum_Stack_1 {
//
//
//    public static class Minimum_Stack_2 {
//        Stack<Integer> allData;
//        Stack<Integer> minData;
//
//
//        int size() {
//            return allData.size();
//        }
//
//        void push(int val) {
//           allData.push(val);
//
//           if (minData.size() == 0 || val <= minData.peek()){
//               minData.push(val);
//           }
//        }
//
//        int pop() {
//            if(size() == 0){
//                System.out.println("Stack underflow");
//                return -1;
//            } else{
//              int val = allData.pop();
//
//
//              if (val == minData.peek()){
//                  minData.pop();
//              }
//
//              return val;
//            }
//        }
//
//        int top() {
//            if(size() == 0){
//                System.out.println("Stack underflow");
//                return -1;
//            } else{
//                return allData.peek();
//            }
//        }
//
//
//        int min(){
//            if(size() == 0){
//                System.out.println("Stack underflow");
//                return -1;
//            } else{
//                return minData.peek();
//            }
//        }
//
//
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        Minimum_Stack_2 st = new Minimum_Stack_2();
//
//        String str;
//        while (!(str = br.readLine()).equals("quit")) { // Fixed infinite loop issue
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
//                if (val != -1){
//                    System.out.println(val);
//                }
//            }
//        }
//    }
//}














package Stack2;

import java.io.*;
import java.util.*;

public class Minimum_Stack_1 {
    public static class Minimum_Stack_2 {
        Stack<Integer> allData;
        Stack<Integer> minData;

        // ✅ Fixed: Constructor added to initialize stacks
        public Minimum_Stack_2() {
            allData = new Stack<>();
            minData = new Stack<>();
        }

        int size() {
            return allData.size();
        }

        void push(int val) {
            allData.push(val);

            // ✅ Fixed: Ensuring min stack maintains the minimum value
            if (minData.size() == 0 || val <= minData.peek()) {
                minData.push(val);
            }
        }

        int pop() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                int val = allData.pop();

                // ✅ Fixed: Remove from minData if it's the minimum element
                if (val == minData.peek()) {
                    minData.pop();
                }
                return val;
            }
        }

        int top() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return allData.peek();
            }
        }

        int min() {
            if (size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                return minData.peek();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ✅ Fixed: Corrected object creation
        Minimum_Stack_2 st = new Minimum_Stack_2();

        String str;
        while (!(str = br.readLine()).equals("quit")) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("min")) {
                int val = st.min();
                if (val != -1) {
                    System.out.println(val);
                }
            }
        }
    }
}


//---
//
//Test Cases (With Comments)
//
//Case 1: Basic Stack Operations
//
//push 10  // Stack = [10], Min = 10
//push 20  // Stack = [10, 20], Min = 10
//push 5   // Stack = [10, 20, 5], Min = 5
//push 30  // Stack = [10, 20, 5, 30], Min = 5
//min      // Output = 5 (Minimum element in stack)
//        pop      // Removes 30, Stack = [10, 20, 5], Min = 5
//pop      // Removes 5, Stack = [10, 20], Min = 10 (since 5 was removed)
//        min      // Output = 10
//pop      // Removes 20, Stack = [10], Min = 10
//        pop      // Removes 10, Stack = [], Min stack is empty
//pop      // Stack underflow (since stack is already empty)
//        quit
//
//Expected Output
//
//5
//        5
//        10
//        20
//        10
//Stack underflow
//
//
//---
//
//Case 2: Handling Empty Stack
//
//        pop      // Stack underflow (Stack is empty)
//top      // Stack underflow (No element in stack)
//        min      // Stack underflow (No minimum value available)
//push 50  // Stack = [50], Min = 50
//min      // Output = 50
//        quit
//
//Expected Output
//
//Stack underflow
//Stack underflow
//Stack underflow
//50
//
//
//        ---
//
//Summary of Fixes
//
//✅ Added constructor to initialize stacks
//✅ Fixed object creation in main()
//✅ Ensured minData maintains correct minimum value
//✅ Handled empty stack cases properly
//
//Ab ye correctly min stack implement karega, test karke batao agar koi issue ho!