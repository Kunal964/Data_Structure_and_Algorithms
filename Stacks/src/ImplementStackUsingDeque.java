import java.util.Deque;
import java.util.LinkedList;

public class ImplementStackUsingDeque {
    public static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        // push
        public void push(int data) {
            dq.addFirst(data);
        }

        // pop
        public int pop() {
            return dq.removeFirst();
        }
        // peek
        public int peek() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek: "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
