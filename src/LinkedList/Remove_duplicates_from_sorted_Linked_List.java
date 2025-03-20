//package LinkedList;
////
////public class Remove_duplicates_from_sorted_Linked_List {
////
////    public void removeDuplicates(){
////        LinkedList res = new LinkedList();
////
////        while (this.size() > 0){    // ye loop kini baar chalega l baar chalega jitna   size hoga utni baar
////            int val = this.getFirst();   // O(1)
////            this.removeFirst();  // O(1)
////
////            if (res.size() == 0 || res.tail.data != val){
////                res.addLast(val);   // O(1)
////            }
////        }
////
////       // this = res -> nahi kar sakte kyuki this shirf read only hota hai  this ko nahi change kar sakte uski property ko change kar sakte hai aur hamne this ki tino property change kar di
////        this.head = res.head;
////        this.tail = res.tail;
////        this.size = res.size;
////    }
////}
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
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//}
//
//class LinkedList {
//    Node head, tail;
//    int size = 0;
//
//    void addLast(int data) {
//        Node newNode = new Node();
//        newNode.data = data;
//        newNode.next = null;
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
//    static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
//        LinkedList merged = new LinkedList();
//        Node t1 = l1.head;
//        Node t2 = l2.head;
//
//        while (t1 != null && t2 != null) {
//            if (t1.data <= t2.data) {
//                merged.addLast(t1.data);
//                t1 = t1.next;
//            } else {
//                merged.addLast(t2.data);
//                t2 = t2.next;
//            }
//        }
//
//        while (t1 != null) {
//            merged.addLast(t1.data);
//            t1 = t1.next;
//        }
//
//        while (t2 != null) {
//            merged.addLast(t2.data);
//            t2 = t2.next;
//        }
//
//        return merged;
//    }
//
//    void removeDuplicates() {
//        LinkedList res = new LinkedList();
//
//        while (this.size > 0) {
//            int val = this.head.data;
//            this.head = this.head.next;
//            this.size--;
//
//            if (res.size == 0 || res.tail.data != val) {
//                res.addLast(val);
//            }
//        }
//
//        this.head = res.head;
//        this.tail = res.tail;
//        this.size = res.size;
//    }
//}
//
//public class Remove_duplicates_from_sorted_Linked_List {
//    public static Node midNode(Node head, Node tail) {
//        Node f = head;
//        Node s = head;
//
//        while (f != tail && f.next != tail) {
//            f = f.next.next;
//            s = s.next;
//        }
//        return s;
//    }
//
//    public static LinkedList mergeSort(Node head, Node tail) {
//        if (head == tail) {
//            LinkedList br = new LinkedList();
//            br.addLast(head.data);
//            return br;
//        }
//
//        Node mid = midNode(head, tail);
//        LinkedList fsh = mergeSort(head, mid);
//        LinkedList ssh = mergeSort(mid.next, tail);
//        LinkedList cl = LinkedList.mergeTwoSortedLists(fsh, ssh);
//        return cl;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedList list = new LinkedList();
//
//        System.out.println("Enter the number of elements:");
//        int n = sc.nextInt();
//        System.out.println("Enter the elements:");
//        for (int i = 0; i < n; i++) {
//            list.addLast(sc.nextInt());
//        }
//
//        System.out.println("Original List:");
//        list.printList();
//
//        list = mergeSort(list.head, list.tail);
//
//        System.out.println("Sorted List:");
//        list.printList();
//
//        list.removeDuplicates();
//        System.out.println("List after removing duplicates:");
//        list.printList();
//
//        sc.close();
//    }
//}











import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head, tail;
    int size = 0;

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
        size++;
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

    void removeDuplicates() {
        if (head == null) return;

        LinkedList res = new LinkedList();
        while (this.size > 0) {
            int val = this.head.data;
            this.head = this.head.next;
            this.size--;

            if (res.size == 0 || res.tail.data != val) {
                res.addLast(val);
            }
        }

        this.head = res.head;
        this.tail = res.tail;
        this.size = res.size;
    }
}

public class Remove_duplicates_from_sorted_Linked_List {
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
        return LinkedList.mergeTwoSortedLists(fsh, ssh);
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

        if (list.head != null) {  // Check if the list is non-empty before sorting
            list = mergeSort(list.head, list.tail);
            System.out.println("Sorted List:");
            list.printList();
        }

        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.printList();

        sc.close();
    }
}

