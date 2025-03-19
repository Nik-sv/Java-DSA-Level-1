package LinkedList;

import java.io.*;
import java.util.*;

public class Merge_two_sorted_Linked_List {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is Empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments");
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

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is Empty");
            } else {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null;
                }
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;
            LinkedList res = new LinkedList();

            while (one != null && two != null) {
                if (one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;  // ✅ Corrected traversal
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                res.addLast(one.data);
                one = one.next;  // ✅ Corrected traversal
            }

            while (two != null) {
                res.addLast(two.data);
                two = two.next;  // ✅ Corrected traversal
            }

            return res;
        }


        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n1 = Integer.parseInt(br.readLine());
            LinkedList l1 = new LinkedList();
            String[] values1 = br.readLine().split(" ");
            for (int i = 0; i < n1; i++) {
                int d = Integer.parseInt(values1[i]);
                l1.addLast(d);
            }

            int n2 = Integer.parseInt(br.readLine());
            LinkedList l2 = new LinkedList();
            String[] values2 = br.readLine().split(" ");
            for (int i = 0; i < n2; i++) {
                int d = Integer.parseInt(values2[i]);
                l2.addLast(d);
            }

            LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);
            merged.display();
        }
    }
}
