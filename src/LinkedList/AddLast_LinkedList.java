//package LinkedList;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.List;
//
//public class AddLast_LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//    }
//
//    public static class LinkedList{
//        Node head;
//        Node tail;
//        int size;
//
//        void addLast(){
//
//            Node temp = new Node();
//            temp.data = val;
//            temp.next = null;
//
//
//            if (size == 0){
//               head = tail = temp;
//            } else {
//               tail.next = temp;   // previous tail connection
//               tail = temp;
//
//             }    // size increasing
//
//            size++;
//        }
//    }
//
//    public static void testList(LinkedList list) {
//        for (Node temp = list.head; temp != null; temp = temp.next) {
//            System.out.println(temp.data);
//        }
//        System.out.println(list.size);
//
//        if (list.size > 0){
//            System.out.println(list.tail.data);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        LinkedList list = new LinkedList();
//
//        String str = br.readLine();
//        while (str.equals("quit") == false){
//            if (str.startsWith("addLast")){
//                int val = Integer.parseInt(str.split(" ")[1]);
//                list.addLast(val);
//            }
//            str = br.readLine();
//        }
//
//        testList(list);
//    }
//}




















package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AddLast_LinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) { // Now correctly takes val as a parameter
            Node temp = new Node(); // Create a new node
            temp.data = val; // Assign value to the new node
            temp.next = null; // Ensure next is null

            if (size == 0) {
                head = tail = temp; // If list is empty, head and tail both point to temp
            } else {
                tail.next = temp; // Link previous tail to the new node
                tail = temp; // Update tail to the new node
            }
            size++; // Increase size of the linked list
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " -> ");
        }
        System.out.println("null");
        System.out.println("Size: " + list.size);

        if (list.size > 0) {
            System.out.println("Tail: " + list.tail.data);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = br.readLine();
        }

        testList(list);
    }
}

