package LinkedList;
//
//public class OddEven {
//
//    LinkedList odd = new LinkedList();
//    LinkedList even = new LinkedList();
//
//    while (this.size > 0){
//        int val = this.getFirst();
//        this.removeFirst();   // ye isliye hai taaki ek moment mai ek hi node hotaki space complexity sahi rahegi
//
//        if (val % 2 == 0){
//          even.addLast(val);
//        } else {
//          odd.addLast(val);
//        }
//    }
//
//    if (odd.size > 0 && even.size > 0) {
//        odd.tail.next = even.head;
//        this.head = odd.head;
//        this.tail = even.tail;
//        this.size = odd.size + even.size;
//    } else if (odd.size > 0) {
//        this.head = odd.head;
//        this.tail = odd.tail;
//        this.size =  odd.size;
//    } else if (even.size > 0) {
//        this.head = even.head;
//        this.tail = even.tail;
//        this.size = even.size;
//    }
//}









import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;
}

class CustomLinkedList {
    ListNode head, tail;
    int size = 0;

    void addLast(int data) {
        ListNode newNode = new ListNode();
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
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static CustomLinkedList mergeTwoSortedLists(CustomLinkedList l1, CustomLinkedList l2) {
        CustomLinkedList merged = new CustomLinkedList();
        ListNode t1 = l1.head;
        ListNode t2 = l2.head;

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

        CustomLinkedList res = new CustomLinkedList();
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

    void oddEven() {
        if (head == null) return;

        CustomLinkedList odd = new CustomLinkedList();
        CustomLinkedList even = new CustomLinkedList();

        while (this.size > 0) {
            int val = this.head.data;
            this.head = this.head.next;
            this.size--;

            if (val % 2 == 0) {
                even.addLast(val);
            } else {
                odd.addLast(val);
            }
        }

        if (odd.size > 0 && even.size > 0) {
            odd.tail.next = even.head;
            this.head = odd.head;
            this.tail = even.tail;
            this.size = odd.size + even.size;
        } else if (odd.size > 0) {
            this.head = odd.head;
            this.tail = odd.tail;
            this.size = odd.size;
        } else if (even.size > 0) {
            this.head = even.head;
            this.tail = even.tail;
            this.size = even.size;
        }
    }
}

public class OddEven {
    public static ListNode midNode(ListNode head, ListNode tail) {
        ListNode f = head;
        ListNode s = head;

        while (f != tail && f.next != tail) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    public static CustomLinkedList mergeSort(ListNode head, ListNode tail) {
        if (head == tail) {
            CustomLinkedList br = new CustomLinkedList();
            br.addLast(head.data);
            return br;
        }

        ListNode mid = midNode(head, tail);
        CustomLinkedList fsh = mergeSort(head, mid);
        CustomLinkedList ssh = mergeSort(mid.next, tail);
        return CustomLinkedList.mergeTwoSortedLists(fsh, ssh);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomLinkedList list = new CustomLinkedList();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        System.out.println("Original List:");
        list.printList();

        if (list.head != null) {
            list = mergeSort(list.head, list.tail);
            System.out.println("Sorted List:");
            list.printList();
        }

        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.printList();

        list.oddEven();
        System.out.println("List after segregating odd and even:");
        list.printList();

        sc.close();
    }
}
