package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prefix_Evaluations_and_Conversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        //code

        Stack<Integer> vs  = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> pf = new Stack<>();

        for (int i = exp.length() - 1; i >= 0 ; i--) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1 , v2 , ch);
                vs.push(val);


                //pop two elements from infix stack
                String iv1 = is.pop();
                String iv2 = is.pop();
                String ival = "(" + iv1 + ch + iv2 + ")";
                is.push(ival);

                // pop two elements from prefix stack  ( Fixed: should use ps, not is)
                String pv1 = pf.pop();
                String pv2 = pf.pop();
                String pval =  pv1 + pv2 + ch  ;
                pf.push(pval);
            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                pf.push(ch + "");
            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(pf.pop());
    }

    public static int operation(int v1 , int v2 , char op){
        if (op == '+'){
            return v1 + v2;
        } else if (op == '-'){
            return v1 - v2;
        }else if (op == '*'){
            return v1 * v2;
        }else {
            return v1 / v2;
        }
    }
}


