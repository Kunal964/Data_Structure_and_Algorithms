package linkedlist;

public class DeleteNthfromEnd {
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
    public static int size;

    public void addFirst(int data) {
        // Step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 - newNode next = head
        newNode.next = head;
        // Step 3 - head = newNode
        head = newNode;
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

    public  void deleteNthfromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;  // Remove First
            return;
        }
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        assert prev.next != null;
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        DeleteNthfromEnd DE = new DeleteNthfromEnd();
        DE.addFirst(4);
        DE.addFirst(3);
        DE.addFirst(2);
        DE.addFirst(1);
        DE.print();

        DE.deleteNthfromEnd(3);
        DE.print();

    }
}
