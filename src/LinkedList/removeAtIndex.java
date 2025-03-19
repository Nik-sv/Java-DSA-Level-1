//import java.io.*;
//
//public class removeAtIndex {
//
//    public static class Node {
//        int data;
//        Node next;
//    }
//
//    public static class LinkedList {
//        Node head = null;
//        Node tail = null;
//        int size = 0;
//
//        // ✅ Add a node at the end
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
//        // ✅ Display the linked list
//        void display() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//
//        // ❌ Implement removeAt yourself
//        void removeAt(int idx) {
//            // Your code goes here
//            if (idx < 0 || idx >= size){
//                System.out.println("Invalid arguments");
//            } else if (idx == 0) {
//                removeFirst();
//            } else if (idx == size -1) {
//                removeLast();
//            } else {
//                Node temp = head;
//                for (int i = 0; i < idx - 1; i++) {
//                    temp = temp.next;
//                }
//
//                temp.next = temp.next.next;
//                size--;
//            }
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        LinkedList list = new LinkedList();
//
//        String str = br.readLine();
//        while (!str.equals("quit")) {
//            if (str.startsWith("addLast")) {
//                int val = Integer.parseInt(str.split(" ")[1]);
//                list.addLast(val);
//            } else if (str.equals("display")) {
//                list.display();
//            } else if (str.startsWith("removeAt")) {
//                int idx = Integer.parseInt(str.split(" ")[1]);
//                list.removeAt(idx);  // Call your function here
//            }
//            str = br.readLine();
//        }
//    }
//}



















import java.io.*;

public class removeAtIndex {

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

        // ✅ Remove the last node
        void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                while (temp.next != tail) {  // Stop at second last node
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }
        }

        // ✅ Remove a node at a specific index
        void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        // ✅ Display the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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
            } else if (str.equals("display")) {
                list.display();
            } else if (str.startsWith("removeAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                list.removeAt(idx);
            }
            str = br.readLine();
        }
    }
}

