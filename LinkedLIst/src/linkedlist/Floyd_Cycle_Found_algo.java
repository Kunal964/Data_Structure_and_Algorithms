package linkedlist;

public class Floyd_Cycle_Found_algo {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    // Detect a Loop/Cycle in a LL
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;  // cycle exists
            }
        }
        return false;  // cycle doesn't exist
    }
    // Remove a Loop/Cycle in a LL
    public static  void RemoveCycle() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {  //  cycle == false
            return;
        }

        // Find Meeting Point
        slow = head;
        Node Prev = null;  // last node
        while (slow != fast) {
            Prev = fast;    //
            slow = slow.next;
            fast = fast.next;
        }

        // Remove Cycle --> last.next = null // connnection terminate krdiya list ka
        assert Prev != null;
        Prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        Node temp  = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = temp;
        // 1+->2-->3-->4-->5-->6--3

        System.out.println("Loop Exists in Linked List or Not: "+isCycle());
        RemoveCycle();
        System.out.println("Loop Exists in Linked List or Not: "+isCycle());
    }
}
