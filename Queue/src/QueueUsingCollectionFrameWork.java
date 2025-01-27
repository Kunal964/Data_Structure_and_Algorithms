package Queue.src;

import java.util.Comparator;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionFrameWork {
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>(); // creating an object using linkedlist because queue is an interface
    //    Queue<Integer> q = new ArrayDeque<>(); //  creating an object using ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
