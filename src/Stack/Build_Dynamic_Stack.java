package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Build_Dynamic_Stack {
    int[] data;
    int tos;

    public Build_Dynamic_Stack(int cap) {
        data = new int[cap];
        tos = -1;
    }

    int size() {
        return tos + 1;
    }

    void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(data[i] + " "); // Print without newline for correct formatting
        }
        System.out.println();
    }

    void push(int val) {
        if (tos == data.length - 1) {                          // Dynamic Stack building for the issue of size
           int[] ndata = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                ndata[i] = data[i];
            }
            data = ndata;

            tos++;
            data[tos] = val;

        } else {
            tos++;
            data[tos] = val;
        }
    } // *Fixed: Added missing closing brace*

    int pop() {
        if (tos == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int val = data[tos];
            tos--;
            return val;
        }
    }

    int top() {
        if (tos == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return data[tos];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Build_Dynamic_Stack st = new Build_Dynamic_Stack(n);

        String str;
        while (!(str = br.readLine()).equals("quit")) { // Fixed infinite loop issue
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
            } else if (str.startsWith("display")) {
                st.display();
            }
        }
    }
}