//package LinkedList;
//
//
//import java.util.Scanner;
//
//class Kth_element_from_the_end_in_Linked_List {
//    static class Node {
//        int data;
//        Node next;
//    }
//
//    private Node head;
//
//    // Insert node at the end
//    public void add(int data) {
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = null;
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//    }
//
//    // Function to find the Kth node from the end (You will implement this)
//    public int findKthFromEnd(int k) {
//        Node s = head;
//        Node f = head;
//
//        for (int i = 0; i < k; i++) {
//            f = f.next;
//        }
//
//        while (f != tail){
//            s = s.next;
//            f = f.next;
//        }
//
//        return s.data;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Kth_element_from_the_end_in_Linked_List list = new Kth_element_from_the_end_in_Linked_List();
//
//        int n = sc.nextInt(); // Number of elements
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//
//        int k = sc.nextInt(); // Kth node from end
//        int result = list.findKthFromEnd(k);
//        if (result != -1) {
//            System.out.println(result);
//        } else {
//            System.out.println("Invalid input: K is greater than the length of the list");
//        }
//        sc.close();
//    }
//}









//package LinkedList;
//
//import java.util.Scanner;
//
//class Kth_element_from_the_end_in_Linked_List {
//    static class Node {
//        int data;
//        Node next;
//    }
//
//    private Node head;
//    private Node tail; // Explicitly tracking the tail
//
//    // Insert node at the end
//    public void add(int data) {
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = null;
//
//        if (head == null) {
//            head = newNode;
//            tail = newNode; // Update tail
//            return;
//        }
//
//        tail.next = newNode;
//        tail = newNode; // Update tail
//    }
//
//    // Function to find the Kth node from the end
//    public int findKthFromEnd(int k) {
//        Node s = head;
//        Node f = head;
//
//        for (int i = 0; i < k; i++) {
//            if (f == null) { // Check if k is greater than the length of the list
//                return -1;
//            }
//            f = f.next;
//        }
//
//        while (f != tail) { // Now checking until f reaches tail
//            s = s.next;
//            f = f.next;
//        }
//
//        return s.data;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Kth_element_from_the_end_in_Linked_List list = new Kth_element_from_the_end_in_Linked_List();
//
//        int n = sc.nextInt(); // Number of elements
//        for (int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//
//        int k = sc.nextInt(); // Kth node from end
//        int result = list.findKthFromEnd(k);
//        if (result != -1) {
//            System.out.println(result);
//        } else {
//            System.out.println("Invalid input: K is greater than the length of the list");
//        }
//        sc.close();
//    }
//}
//
//
//











package LinkedList;

import java.util.Scanner;

class Kth_element_from_the_end_in_Linked_List {
    static class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail; // Explicitly tracking the tail

    // Insert node at the end
    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            tail = newNode; // Update tail
            return;
        }

        tail.next = newNode;
        tail = newNode; // Update tail
    }

    // Function to find the Kth node from the end
    public int findKthFromEnd(int k) {
        Node s = head;
        Node f = head;

        for (int i = 0; i < k; i++) {
            if (f == null) { // Check if k is greater than the length of the list
                return -1;
            }
            f = f.next;
        }

        while (f != null) { // Corrected the condition
            s = s.next;
            f = f.next;
        }

        return s.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kth_element_from_the_end_in_Linked_List list = new Kth_element_from_the_end_in_Linked_List();

        int n = sc.nextInt(); // Number of elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int k = sc.nextInt(); // Kth node from end
        int result = list.findKthFromEnd(k);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Invalid input: K is greater than the length of the list");
        }
        sc.close();
    }
}




