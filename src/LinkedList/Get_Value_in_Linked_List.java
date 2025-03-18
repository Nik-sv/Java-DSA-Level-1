//package LinkedList;
//
//
//
//import java.io.*;
//import java.util.*;
//
//public class Get_Value_in_Linked_List {
//
//    public static class LinkedList {
//        Node head;
//        Node tail;
//        int size;
//    }
//
//    public static class LinkedList {
//        Node head;
//        Node tail;
//        int size;
//
//        void addLast(int val) {
//            Node temp = new Node();
//            temp.data = val;
//            temp.next = null;
//        }
//
//        if (size == 0) {
//            head = tail = temp;
//        } else {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//
//    if (size == 0){
//        System.out.println("List is empty");
//    } else if (size == 1){
//        head = tail = null;
//        size = 0;
//    } else {
//        head = head.next;
//        size--;
//    }
//
//
//    public int getFrist(){
//        // write your code hear
//    }
//
//    public int getLast(){
//        // write your code hear
//    }
//
//    public int getAt(int idx){
//       // write your code hear
//    }
//
//    public static void main(String[] args) throws Exception {
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       LinkedList = new LinkedList();
//    }
//}






//import java.io.*;
//
//public class Get_Value_in_Linked_List {
//
//    public static class Node {
//        int data;
//        Node next;
//    }
//
//    public static class LinkedList {
//        Node head;
//        Node tail;
//        int size;
//
//        // Add a node at the end of the list
//        void addLast(int val) {
//            Node temp = new Node();
//            temp.data = val;
//            temp.next = null;
//
//            if (size == 0) {
//                head = tail = temp;
//            } else {
//                tail.next = temp;
//                tail = temp;
//            }
//            size++;
//        }
//
//        // Remove the first node from the list
//        void removeFirst() {
//            if (size == 0) {
//                System.out.println("List is empty");
//            } else if (size == 1) {
//                head = tail = null;
//                size = 0;
//            } else {
//                head = head.next;
//                size--;
//            }
//        }
//
//        // Get the first element (To be implemented by you)
//        public int getFirst() {
//
//            if (size == 0){
//                 System.out.println("List is empty");
//                 return -1;
//             } else {
//               return head.data;
//            }
//        }
//
//        // Get the last element (To be implemented by you)
//        public int getLast() {
//            if (size == 0){
//                System.out.println("List is empty");
//                return -1;
//            } else {
//              return tail.data;
//            }
//        }
//
//        // Get the element at a specific index (To be implemented by you)
//        public int getAt(int idx) {
//            if (size == 0){
//                System.out.println("List is empty");
//                return -1;
//            } else if (idx < 0 || idx >= size){
//                System.out.println("Invalid Arguments");
//                return -1;
//            } else {
//                Node temp = head;
//                for (int i = 0; i < idx; i++) {
//                    temp = temp.next;
//                }
//                return temp.data;
//            }
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        LinkedList list = new LinkedList();
//
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//
//        // Test cases for your implementation
//        System.out.println("First: " + list.getFirst()); // Expected output: ??
//        System.out.println("Last: " + list.getLast());   // Expected output: ??
//        System.out.println("At index 1: " + list.getAt(1)); // Expected output: ??
//    }
//}
//






























import java.io.*;

public class Get_Value_in_Linked_List {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // ✅ Add a node at the end
        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        // ✅ Remove the first node
        void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        // ✅ Get the first element
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        // ✅ Get the last element
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        // ✅ Get the element at a specific index
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.equals("removeFirst")) {
                list.removeFirst();
            } else if (str.equals("getFirst")) {
                System.out.println(list.getFirst());
            } else if (str.equals("getLast")) {
                System.out.println(list.getLast());
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.getAt(idx));
            }
            str = br.readLine();
        }
    }
}
