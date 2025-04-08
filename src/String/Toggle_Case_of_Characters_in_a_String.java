package String;

import java.util.Scanner;

public class Toggle_Case_of_Characters_in_a_String {

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char uch = (char)(ch - 'a' + 'A');  // lowercase to uppercase
                sb.setCharAt(i, uch);
            } else if (ch >= 'A' && ch <= 'Z') {
                char lch = (char)(ch - 'A' + 'a');  // uppercase to lowercase
                sb.setCharAt(i, lch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String toggled = toggleCase(str);
        System.out.println(toggled);
    }
}
