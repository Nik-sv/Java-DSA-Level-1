package LinkedList;
//
//public class MergeSort_LinkedList {
//
//
//
//
//
//
//
//
//
//
//
//
//    public static Node midNode(Node head , Node tail){
//        Node f = head;
//        Node s = head;
//
//        while(f != tail && f.next != tail){
//            f = f.next.next;
//            s = s.next;
//        }
//
//        return s;
//    }
//    public static LinkedList mergeSort(Node head , Node tail){
//        if (head == tail){
//            LinkedList br = new LinkedList();
//            br.addLast(head.data);
//            return br;
//        }
//
//        Node mid = midNode(head , tail);
//        LinkedList fsh = mergeSort(head , mid);
//        LinkedList ssh = mergeSort(mid.next , tail);
//        LinkList cl = LinkedList.mergeTwoSortedLists(fsh , ssh);
//        return cl;
//    }
//}











import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head, tail;

    void addLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
        LinkedList merged = new LinkedList();
        Node t1 = l1.head;
        Node t2 = l2.head;

        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                merged.addLast(t1.data);
                t1 = t1.next;
            } else {
                merged.addLast(t2.data);
                t2 = t2.next;
            }
        }

        while (t1 != null) {
            merged.addLast(t1.data);
            t1 = t1.next;
        }

        while (t2 != null) {
            merged.addLast(t2.data);
            t2 = t2.next;
        }

        return merged;
    }
}

public class MergeSort_LinkedList {
    public static Node midNode(Node head, Node tail) {
        Node f = head;
        Node s = head;

        while (f != tail && f.next != tail) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    public static LinkedList mergeSort(Node head, Node tail) {
        if (head == tail) {
            LinkedList br = new LinkedList();
            br.addLast(head.data);
            return br;
        }

        Node mid = midNode(head, tail);
        LinkedList fsh = mergeSort(head, mid);
        LinkedList ssh = mergeSort(mid.next, tail);
        LinkedList cl = LinkedList.mergeTwoSortedLists(fsh, ssh);
        return cl;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        System.out.println("Original List:");
        list.printList();

        list = mergeSort(list.head, list.tail);

        System.out.println("Sorted List:");
        list.printList();

        sc.close();
    }
}

