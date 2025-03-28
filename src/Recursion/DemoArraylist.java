package Recursion;

import java.util.*;

public class  DemoArraylist{
    public static void main(String[] args) {
        // Array list Dynamic hota hai grow hone wala who initially aapna size increase kar sakta hai
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list + " -> " + list.size());
        //System.out.println(list.size());


        // Agar isse loop laga k print karna ho tho -> forof loop lagega
//        for(int val: list){
//            System.out.println(val);
//        }

        for (int i = 0; i < list.size(); i++) {
           int val = list.get(i);   // nikalle ge kaise
            System.out.println(val);
        }

        // Ek bada Intresting FUnction hai list.set
        list.set(2, 300);   // add size badhata hai jo set hai who index pe jaake value badal deta hai
        System.out.println(list + "->" + list.size());


        // add ka ek variation aur bhi hai ki bich mai kahi add karna ho aap add kar sakte ho
        list.add(2 , 3000);
        System.out.println(list + "->" + list.size());




    }
}








//package Recursion;
//
//import java.util.*;
//class ArrayList clashes with imported class java.util.ArrayList
//
//public class ArrayListDemo {
//    public static void main(String[] args) {
//        // ArrayList is dynamic - it can grow or shrink at runtime
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println(list + " -> " + list.size());
//
//        // Printing using normal for loop
//        for (int i = 0; i < list.size(); i++) {
//            int val = list.get(i);  // get() fetches value at index
//            System.out.println(val);
//        }
//
//        // Using set() - it replaces element at given index
//        list.set(2, 300);
//        System.out.println(list + " -> " + list.size());
//
//        // Using add(index, value) - inserts element at specific index
//        list.add(2, 3000);
//        System.out.println(list + " -> " + list.size());
//    }
//}
//
