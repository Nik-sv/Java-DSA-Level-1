import java.io.BufferedReader;
import java.io.InputStreamReader;

public class removeFrist {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head = null; // Explicitly initializing without constructor
        Node tail = null;
        int size = 0;

        // ✅ addLast function (Prints the last Node of the linked list)
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

        // ✅ Display function (Prints the linked list)
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // ✅ Size function (Returns the size of the linked list)
        int size() {
            return size;
        }

        // 🚀 TODO: Implement removeFirst()
        void removeFirst() {
            // Your task: Remove the first node from the linked list.
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;   // major code yahi hai
                size--;
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
                } else if (str.equals("size")) {
                    System.out.println(list.size());
                } else if (str.equals("removeFirst")) {
                    list.removeFirst(); // Call your function
                }
                str = br.readLine();
            }
        }
    }
    }
