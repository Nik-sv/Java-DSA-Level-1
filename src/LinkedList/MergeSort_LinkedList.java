//package LinkedList;
////
////public class MergeSort_LinkedList {
////
////
////
////
////
////
////
////
////
////
////
////
////    public static Node midNode(Node head , Node tail){
////        Node f = head;
////        Node s = head;
////
////        while(f != tail && f.next != tail){
////            f = f.next.next;
////            s = s.next;
////        }
////
////        return s;
////    }
////    public static LinkedList mergeSort(Node head , Node tail){
////        if (head == tail){
////            LinkedList br = new LinkedList();
////            br.addLast(head.data);
////            return br;
////        }
////
////        Node mid = midNode(head , tail);
////        LinkedList fsh = mergeSort(head , mid);
////        LinkedList ssh = mergeSort(mid.next , tail);
////        LinkList cl = LinkedList.mergeTwoSortedLists(fsh , ssh);
////        return cl;
////    }
////}
//
//
//
//
//
//import java.util.Scanner;
//
//class N0ode {
//    int data;
//    Node next;
//}
//
//class Linked_List {
//    Node head, tail;
//    int size = 0;
//
//    void addLast(int data) {
//        Node newNode = new Node();
//        newNode.data = data;
//
//        if (head == null) {
//            head = tail = newNode;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//        }
//        size++;
//    }
//
//    void printList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    void addFirst(int val) {
//        Node newNode = new Node();
//        newNode.data = val;
//        newNode.next = head;
//        head = newNode;
//        if (size == 0) {
//            tail = newNode;
//        }
//        size++;
//    }
//
//    void KReverse(int k) {
//        LinkedList prev = null;
//
//        while (this.size > 0) {
//            LinkedList curr = new LinkedList();
//
//            if (this.size >= k) {
//                for (int i = 0; i < k; i++) {
//                    int val = this.head.data;
//                    this.head = this.head.next;
//                    this.size--;
//                    curr.addFirst(val);
//                }
//            } else {
//                int os = this.size;
//                for (int i = 0; i < os; i++) {
//                    int val = this.head.data;
//                    this.head = this.head.next;
//                    this.size--;
//                    curr.addLast(val);
//                }
//            }
//
//            if (prev == null) {
//                prev = curr;
//            } else {
//                prev.tail.next = curr.head;
//                prev.tail = curr.tail;
//                prev.size += curr.size;
//            }
//        }
//
//        this.head = prev.head;
//        this.tail = prev.tail;
//        this.size = prev.size;
//    }
//}
//
//public class kReverse {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedList list = new LinkedList();
//
//        System.out.println("Enter the number of elements:");
//        int n = sc.nextInt();
//
//        System.out.println("Enter the elements:");
//        for (int i = 0; i < n; i++) {
//            list.addLast(sc.nextInt());
//        }
//
//        System.out.println("Enter the value of K:");
//        int k = sc.nextInt();
//
//        System.out.println("Original List:");
//        list.printList();
//
//        list.KReverse(k);
//
//        System.out.println("After K-Reverse:");
//        list.printList();
//
//        sc.close();
//    }
//}
//
//
//
//
//
