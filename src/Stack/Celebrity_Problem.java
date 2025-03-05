package Stack;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Stack;
//
//public class Celebrity_Problem {
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
//        int[][] arr = new int[n][n];
//
//        for (int j = 0; j < n; j++) {
//            String line = br.readLine();
//            for (int k = 0; k < n; k++) {
//                arr[j][k] = line.charAt(k) - '0';
//            }
//        }
//
//        findCelebrity(arr);
//
//    }
//
//    public static void findCelebrity(int[][] arr){
//        // if a celebrity is there print it's index (not Position), if there
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            st.push(i);
//        }
//
//        while (st.size() >= 2){
//            int i = st.pop();
//            int j = st.pop();
//
//            if (arr[i][j] == 1){
//                // if i knows j -> i is not a celebrity
//              st.push(j);
//            }else {
//                // if i does not know j -> j is not a celebrity
//                st.push(i);
//            }
//        }
//
//        int pot = st.pop();
//        for (int i = 0; i < arr.length; i++) {
//            if (i != pot){
//                if(arr[i][pot] == 0 || arr[pot][i] == 1){
//                    System.out.println("none");
//                    return;
//                }
//            }
//        }
//        System.out.println(pot);
//    }
//}






import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Celebrity_Problem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine().trim()); // Trim to remove extra spaces

        while (T-- > 0) {
            // Read matrix size
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][n];

            // Read matrix input
            for (int i = 0; i < n; i++) {
                String line = br.readLine().trim();  // Trim extra spaces

                if (line.length() != n) {  // Ensure correct input length
                    System.out.println("Error: Invalid input format. Each row must have exactly " + n + " characters.");
                    return;
                }

                for (int j = 0; j < n; j++) {
                    arr[i][j] = line.charAt(j) - '0';  // Convert '0'/'1' to integer
                }
            }

            // Function Call
            findCelebrity(arr);
        }
    }

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();

        // Push all persons into stack
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }

        // Find the potential celebrity
        while (st.size() >= 2) {
            int i = st.pop();
            int j = st.pop();

            if (arr[i][j] == 1) {
                st.push(j); // i knows j, so i is not a celebrity
            } else {
                st.push(i); // i does not know j, so j is not a celebrity
            }
        }

        // Potential celebrity
        int pot = st.pop();

        // Validate celebrity conditions
        for (int i = 0; i < arr.length; i++) {
            if (i != pot) {
                if (arr[i][pot] == 0 || arr[pot][i] == 1) {
                    System.out.println("none"); // No celebrity found
                    return;
                }
            }
        }

        System.out.println(pot); // Print celebrity index
    }
}




