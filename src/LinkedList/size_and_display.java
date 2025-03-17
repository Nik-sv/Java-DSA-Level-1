import java.io.BufferedReader;
import java.io.InputStreamReader;

public class size_and_display {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head = null; // Explicitly initializing without constructor
        Node tail = null;
        int size = 0;

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
         while (temp != null){
             System.out.println(temp.data + " ");
             temp = temp.next;
         }
            System.out.println();
        }

        // ✅ Size function (Returns the size of the linked list)
        int size() {
           return size;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList(); // No constructor, still works fine

        String str = br.readLine();
        while (!str.equals("quit")) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.equals("display")) {
                list.display();
            } else if (str.equals("size")) {
                System.out.println(list.size());
            }
            str = br.readLine();
        }
    }
}
