package Stack;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();    // Stack declare ho gai Define nahi hui

        st.push(10);
        st.push(20);
        System.out.println( st + " -> " + st.peek() +  + st.size() );
        st.push(30);
        System.out.println( st + " -> " + st.peek() +  + st.size() );
        st.push(40);

        System.out.println( st + " -> " + st.peek() +  + st.size() );

        st.pop();
        System.out.println( st + " -> " + st.peek() +  + st.size() );
        st.pop();
        System.out.println( st + " -> " + st.peek() +  + st.size() );
        st.pop();
        System.out.println( st + " -> " + st.peek() +  + st.size() );
        st.pop();
        System.out.println( st + " -> " + st.size() );


    }
}
