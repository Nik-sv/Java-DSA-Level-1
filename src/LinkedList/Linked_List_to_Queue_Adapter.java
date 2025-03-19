package LinkedList;


import java.util.LinkedList;
import java.util.Scanner;

class Linked_List_to_Queue_Adapter {
    private LinkedList<Integer> list;

    public Linked_List_to_Queue_Adapter() {
        list = new LinkedList<>();
    }

    // Returns the size of the queue
    public int size() {
         return list.size();
    }

    // Adds an element to the queue
    public void add(int value) {
        list.addLast(value);
    }

    // Removes and returns the front element of the queue
    public int remove() {
       if (size() == 0){
           System.out.println("Queue underFlow");
           return -1;
       } else {
           return list.removeFirst();
       }
    }

    // Returns the front element without removing it
    public int peek() {
        if (size() == 0){
            System.out.println("Queue underFlow");
            return -1;
        } else {
            return list.getFirst();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List_to_Queue_Adapter queue = new Linked_List_to_Queue_Adapter();

        int n = sc.nextInt(); // Number of operations
        for (int i = 0; i < n; i++) {
            String op = sc.next();

            if (op.equals("add")) {
                int value = sc.nextInt();
                queue.add(value);
            } else if (op.equals("remove")) {
                try {
                    System.out.println(queue.remove());
                } catch (Exception e) {
                    System.out.println("Queue is empty");
                }
            } else if (op.equals("peek")) {
                try {
                    System.out.println(queue.peek());
                } catch (Exception e) {
                    System.out.println("Queue is empty");
                }
            } else if (op.equals("size")) {
                System.out.println(queue.size());
            }
        }
        sc.close();
    }
}