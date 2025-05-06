package linkedlist;

public class DoubleLinkedList {
    
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at Specific Position
    public void addAtPosition(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }

    // Remove First
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Remove Last
    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // Remove at Specific Position
    public int removeAtPosition(int idx) {
        if (idx == 0) {
            return removeFirst();
        }
        if (idx == size - 1) {
            return removeLast();
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return val;
    }

    // Print List
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print(); // 1<->2<->3<->null
        System.out.println("Size: " + size);

        dll.addLast(4);
        dll.print(); // 1<->2<->3<->4<->null
        System.out.println("Size: " + size);

        dll.addAtPosition(2, 9);
        dll.print(); // 1<->2<->9<->3<->4<->null
        System.out.println("Size: " + size);

        dll.removeFirst();
        dll.print(); // 2<->9<->3<->4<->null
        System.out.println("Size: " + size);

        dll.removeLast();
        dll.print(); // 2<->9<->3<->null
        System.out.println("Size: " + size);

        dll.removeAtPosition(1);
        dll.print(); // 2<->3<->null
        System.out.println("Size: " + size);
    }
}
