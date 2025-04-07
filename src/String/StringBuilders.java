package String;

public class StringBuilders {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("hello");
//        System.out.println(sb);
//
//        char ch = sb.charAt(0);   // get
//        System.out.println(ch);
//
////        sb.setCharAt(0 , 'd');  // update
////        System.out.println(sb);
//
//        sb.insert(2, 'y');  //  insert
//        System.out.println(sb);
//
//        sb.deleteCharAt(2);   // remove
//        System.out.println(sb);
//
//        sb.append('g');      // add last
//        System.out.println(sb);
//
//
//        System.out.println(sb.length());   // length
//
//



        int n = 1000000000;

        long start = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < n; i++) {
//             s += i;
//        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }


        long end = System.currentTimeMillis();
         long duration = end - start;
        System.out.println(duration);
        //System.out.println(s);

    }
}