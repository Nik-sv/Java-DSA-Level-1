package String;

import java.util.ArrayList;

public class Introduction_to_Arraylists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        list.add(1, 1000);
        System.out.println(list + " -> " + list.size());

        int val = list.get(1);  // not list[1]
        System.out.println(val);

        list.set(1, 2000);  // not list[1] = 2000
        System.out.println(list + " -> " + list.size());

        list.remove(1);
        System.out.println(list + " -> " + list.size());


        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Bello");
        l2.add("Cello");

        System.out.println(l2 + " -> " + l2.size());

//        for (int i = 0; i < list.size(); i++) {
//            int val1 = list.get(i);
//            System.out.println(val);
//        }

//        for (int val1: list) {
//            System.out.println(val1);
//        }

        System.out.println(list);
    }
}
