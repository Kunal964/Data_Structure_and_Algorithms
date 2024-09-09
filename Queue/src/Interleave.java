package Queue.src;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave {
    public static void interLeave(Queue<Integer> q) {  // this can only happen with the even queue
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i< size/2; i++) {
            firstHalf.add(q.remove());  // Adding the firstHalf Elements
        }
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        // Print Q
        while(!q.isEmpty()) {
            System.out.print(q.remove()+ " ");
        }
        System.out.println();
    }
}
