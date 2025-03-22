package LinkedList;

// public class Display_Reverse {
//    public static class Node {
//        int data;
//        Node next;
//    }
//
//    public static class LinkedList {
//        Node head;
//        Node tail;
//        int size;
//    }
//
//    void addLast(int val) {
//        Node temp = new Node();
//        temp.data = val;
//        temp.next = null;
//
//        if (size == 0) {
//            head = tail = null;
//        } else {
//            tail.next = temp;
//            tail = temp;
//        }
//    }

//   // Recursion

//    public void displayReverseHelper(Node node){
//        // Write your code hear
//        if (node == null) {
//            return;
//        }
//     displayReverseHelper(node.next);
//        System.out.println(node.data + " ");
//    }
//
//    public void displayReverse(){
//        displayReverseHelper(head);
//        System.out.println();
//    }
//}

import java.util.Scanner;

class DRNode {
    int data;
    DRNode next;
}

class DRLinkedList {
    DRNode head, tail;
    int size = 0;

    void addLast(int val) {
        DRNode temp = new DRNode();
        temp.data = val;

        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    private void displayReverseHelper(DRNode node) {
        if (node == null) {
            return;
        }
        displayReverseHelper(node.next);
        System.out.print(node.data + " ");
    }

    void displayReverse() {
        displayReverseHelper(head);
        System.out.println();
    }

    void printList() {
        DRNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Display_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DRLinkedList list = new DRLinkedList();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        System.out.println("Original List:");
        list.printList();

        System.out.println("Reversed Display:");
        list.displayReverse();

        sc.close();
    }
}
