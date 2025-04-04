import java.io.*;

public class addAtIndex {

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

        // ✅ Add a node at the beginning
        void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;

            if (size == 0) {
                tail = temp;
            }
            head = temp;
            size++;
        }

        // ❌ Implement addAt yourself
        void addAt(int idx, int val) {
            // Your logic here!
            if (idx < 0 || idx > size){
                System.out.println("Invalid Arguments");
            } else if (idx == 0){
               addFirst(val);
            } else if (idx == size){
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;


               Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;


                size++;   // size badhana bahut jaruri hota hai

            }
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

        // ✅ Get the first element
        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        // ✅ Get the last element
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        // ✅ Get element at a specific index
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid Arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
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
            } else if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addAt")) {
                String[] parts = str.split(" ");
                int idx = Integer.parseInt(parts[1]);
                int val = Integer.parseInt(parts[2]);
                list.addAt(idx, val); // You will implement this
            } else if (str.equals("removeFirst")) {
                list.removeFirst();
            } else if (str.equals("getFirst")) {
                System.out.println(list.getFirst());
            } else if (str.equals("getLast")) {
                System.out.println(list.getLast());
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.getAt(idx));
            } else if (str.equals("display")) {
                list.display();
            }
            str = br.readLine();
        }
    }
}
