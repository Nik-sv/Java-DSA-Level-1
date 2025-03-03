//package Stack;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class Infix_Evaluation {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
//
//        // code
//
//        Stack<Integer> opnds = new Stack<>();
//        Stack<Character> optors = new Stack<>();
//        for (int i = 0; i < exp.length(); i++) {
//
//            char ch = exp.charAt(i);
//
//            if (ch == '('){
//                optors.push(ch);
//            } else if (Character.isDigit(ch)){
//                opnds.push(ch - '0'); // char to int
//            } else if (ch == ')') {
//                while (optors.peek() != '('){
//                    char optor = optors.pop();  // ye kya seen hai
//                    int v2 = opnds.pop();   // a+b se divide karege tho pahelay v1 dalegi isliye who niche hai aur baad mai v2 daalegi
//                    int v1 = opnds.pop();
//
//                   int opv = operation(v1 , v2 , optor);
//                    opnds.push(opv);
//                }
//
//                optors.pop();
//            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
//                // ch ias wanting higher priority operators to solve frist
//                while (optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek()) ){
//
//                    char optor = optors.pop();  // ye kya seen hai
//                    int v2 = opnds.pop();   // a+b se divide karege tho pahelay v1 dalegi isliye who niche hai aur baad mai v2 daalegi
//                    int v1 = opnds.pop();
//
//                    int opv = operation(v1 , v2 , optor);
//                    opnds.push(opv);
//
//
//                }
//                // ch is pushing itself now
//                optors.push(ch);
//            }
//        }
//
//        while (optors.size() != 0){
//            char optor = optors.pop();  // ye kya seen hai
//            int v2 = opnds.pop();   // a+b se divide karege tho pahelay v1 dalegi isliye who niche hai aur baad mai v2 daalegi
//            int v1 = opnds.pop();
//
//            int opv = operation(v1 , v2 , optor);
//            opnds.push(opv);
//        }
//
//        System.out.println(opnds.peek());
//
//
//
//
//         public static int precedence(char optor){
//             if (optor == '+'){
//                 return v1 + v2;
//             } else if (optor == '-'){
//                 return v1 - v2;
//             } else if (optor == '*'){
//                 return v1 * v2;
//             } else {
//                 return v1 / v2;
//             }
//        }
//
//
//
//
//        public static int operation(int v1, int v2, char optor){
//
//        }
//    }
//}















package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Evaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Agar space mile toh skip karo
            if (ch == ' ') {
                continue;
            }

            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                // Yahan assume kar rahe hain ki har number single digit ka hai.
                opnds.push(ch - '0');
            } else if (ch == ')') {
                // Parenthesis band hone par, '(' tak ke sabhi operations perform karo
                while (optors.peek() != '(') {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                // '(' ko pop karo
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // Agar koi operator mila toh dekho kya stack ke top operator ki precedence zyada ya equal hai
                while (!optors.isEmpty() && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())) {
                    char optor = optors.pop();
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    int opv = operation(v1, v2, optor);
                    opnds.push(opv);
                }
                optors.push(ch);
            }
        }

        // Agar abhi bhi operators stack mein bache hain, toh unko evaluate karo
        while (!optors.isEmpty()) {
            char optor = optors.pop();
            int v2 = opnds.pop();
            int v1 = opnds.pop();
            int opv = operation(v1, v2, optor);
            opnds.push(opv);
        }

        System.out.println(opnds.peek());
    }

    // Operator precedence: + and - ko 1, * and / ko 2 priority di gayi hai.
    public static int precedence(char optor) {
        if (optor == '+' || optor == '-') {
            return 1;
        } else if (optor == '*' || optor == '/') {
            return 2;
        }
        return 0;
    }

    // Given two operands and an operator, perform the operation.
    public static int operation(int v1, int v2, char optor) {
        switch(optor) {
            case '+': return v1 + v2;
            case '-': return v1 - v2;
            case '*': return v1 * v2;
            case '/': return v1 / v2; // Dhyan rahe division by zero ka exception handle karna pade agar zaroorat ho.
        }
        return 0;
    }
}
