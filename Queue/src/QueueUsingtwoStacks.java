package Queue.src;

import java.util.Stack;

public class QueueUsingtwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static  Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty() {
            return Queue.s1.isEmpty();
        }
        // add
        public static void add(int data) {
            while(!Queue.s1.isEmpty()) {
                Queue.s2.push(Queue.s1.pop());
            }
            Queue.s1.push(data);

            while(!Queue.s2.isEmpty()) {
                Queue.s1.push(Queue.s2.pop());
            }
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            return Queue.s1.pop();
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }
            return Queue.s1.peek();
        }
    }


    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        while(!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }

    }

}
