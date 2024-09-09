public class StackBasics {
//    static class stack {
//        static ArrayList<Integer> list = new ArrayList<>();
//        public static boolean isEmpty() {
//            return list.isEmpty();
//        }
//
//        // push
//        public static void push(int data) {
//            list.add(data);
//        }
//        // pop
//        public static int pop() {
//            int top = list.getLast();
//            list.removeLast();
//            return top;
//        }
//        //peek
//        public static int peek() {
//            return list.getLast();
//        }
//    }
    static class Node {
        int data;
        Node next; // use r defined data type
        Node(int data) {
            this.data = data;
            this.next = null;
        }
}
    static class stack {
        static Node head = null;
        public static boolean isEmpty() {
            return head == null;
        }
        //push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // pop
        public static int pop() {
            if (isEmpty()) return -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
