/*
package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Conversions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();


        // code

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '('){
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9' ) || (ch > 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                 post.push(ch + "");
                 pre.push(ch + "");
            } else if (ch == ')'){
                while (ops.peek() != '('){
                    char op = ops.pop();

                    String postv2 = post.pop();
                    String postv1 = pre.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2 ;
                    pre.push(prev);
                }

                ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){

                while ( ops.size() > 0 && ops.peek() != '('  &&  precedence(ch) <= precedence(ops.peek())){
                    char op = ops.pop();

                    String postv2 = post.pop();
                    String postv1 = pre.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev =  op + prev1 + prev2 ;
                    pre.push(prev);
                }

                ops.push(ch);
            }
        }

        while (ops.size() != 0){
            char op = ops.pop();

            String postv2 = post.pop();
            String postv1 = pre.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2 ;
            pre.push(prev);
        }

        System.out.println(post.pop());
        System.out.println(pre.pop());

    }

    public static int precedence(char op){
        if (op == '+' || op == '-'){
            return 1;
        } else if (op == '*' || op == '/'){
            return 2;
        } else {
            return 0;
        }
    }
}
*/




package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Conversions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Operand ko dono stacks me push karo.
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();

                    // Postfix conversion ke liye: dono operands post stack se pop karo.
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    // Prefix conversion ke liye: dono operands pre stack se pop karo.
                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    pre.push(prev);
                }
                // '(' ko remove karo.
                ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {
                    char op = ops.pop();

                    // Postfix conversion: dono operands post stack se pop karo.
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv1 + postv2 + op;
                    post.push(postv);

                    // Prefix conversion: dono operands pre stack se pop karo.
                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    pre.push(prev);
                }
                ops.push(ch);
            }
        }

        // Remaining operators ko process karo.
        while (!ops.isEmpty()) {
            char op = ops.pop();

            // Postfix conversion
            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv1 + postv2 + op;
            post.push(postv);

            // Prefix conversion
            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2;
            pre.push(prev);
        }

        System.out.println(post.pop());
        System.out.println(pre.pop());
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }
}
