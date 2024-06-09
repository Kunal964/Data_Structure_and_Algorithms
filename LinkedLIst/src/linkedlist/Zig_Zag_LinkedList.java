package linkedlist;

public class Zig_Zag_LinkedList {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static  int size;

    public void addLast(int data) {
        // step 1
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2
        tail.next = newNode;
        // step 3
        tail = newNode;

    }
    public void zigZag() {
        // Fnd Mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
         while( curr != null) {
             next = curr.next;
             curr.next = prev;
             prev = curr; // curr address store in prev address, so curr became prev --> prev strep forward.
             curr = next; // next address store in curr address, so next became curr --> curr step forward.
         }
         Node leftHead = head;
         Node rightHead = prev;
         Node nextL , nextR;
         // Alternate merge - zig_zag merge
        while (leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;

        }
    }
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Zig_Zag_LinkedList ll = new Zig_Zag_LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // 1-->2-->3-->4-->5-->6

        ll.print();
        ll.zigZag();
        System.out.println("Zig Zag Linked List");
        ll.print();
    }

}
