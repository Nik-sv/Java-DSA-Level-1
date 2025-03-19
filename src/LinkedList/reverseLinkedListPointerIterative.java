
package LinkedList;

import java.io.*;

public class reverseLinkedListPointerIterative {

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

        // ✅ Display the linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // ❌ Implement reverseLinkedListPointerIterative yourself
        void reverseLinkedListPointerIterative() {
            // Your code goes here

            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next;   // store next node
                curr.next = prev;        // Reverse the link
                prev = curr;             // Move prev ahead
                curr = next;             // Move curr ahead
            }
            //Swap head and tail
            tail = head;
            head = prev;
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
            } else if (str.equals("reverseLinkedListPointerIterative")) {
                list.reverseLinkedListPointerIterative();  // Call your function here
            }
            str = br.readLine();
        }
    }
}
