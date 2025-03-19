
package LinkedList;

import java.util.Scanner;

class Middle_of_Linked_List {
    static class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail; // To track the last node

    // Function to add a node at the end
    // Function to add a node at the end
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


    // Function to find the middle node of the linked list
    public int findMiddle() {

        Node s = head;
        Node f = head;

        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s.data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Middle_of_Linked_List list = new Middle_of_Linked_List();

        int n = sc.nextInt(); // Number of elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int middle = list.findMiddle();
        System.out.println(middle);

        sc.close();
    }
}





// isssme odd wale program ka issue aa raha hai logic clear hai par input output lene mai problem hai