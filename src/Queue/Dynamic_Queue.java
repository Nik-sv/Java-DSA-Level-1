package Queue;

import java.util.*;
import java.io.*;


public class Dynamic_Queue {

    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size(){
            return size;
        }

        void display(){
            for(int i = 0; i < size; i++){
                int idx = (front + i) % data.length;
                System.out.print(data[idx] + " ");
            }
            System.out.println();
        }

        void add(int val){
            if (size == data.length){
               int[] ndata = new int[2 * data.length];   // Dynamic Queue code implementation , we make new array which is double in size
                for (int i = 0; i < size; i++) {   // why loop you have logic = f + i
                    int idx = (front + i) % data.length;   // why modulus data.length = Because of circular beheviour
                    ndata[i] = data[idx];   // bec. we have to the previous data into new array which is double in length  so for index point of  view     ,, ye index wali baat thodi kam ghusi hai dimaag mai
                }
                data = ndata;   //  bec. we have to the previous data into new array which is double in length
                front = 0;    // we are starting our arr from 0

                int idx = (front + size) % data.length;   // same as because we have created a new array for that ewe have to this
                data[idx] = val;   // for index also
                size++;       //    size increase must for the further elements      ,     Last at this point
            } else {
                int rear = (front + size) % data.length;
                data[rear] = val;
                size++;
            }
        }

        int remove(){
            if (size == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = data[front];
                front = (front + 1 ) % data.length;
                size--;
                return data[front];
            }
        }

        int peek(){
            if (size == 0){
                System.out.println("Queue underflow");
                return -1;
            } else {
                return data[front];
            }

        }
    }
    public void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue qu = new CustomQueue(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if (str.startsWith("add")){
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1){
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1){
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            } else if (str.startsWith("display")) {
                qu.display();
            }
            str = br.readLine();
        }

    }
}
