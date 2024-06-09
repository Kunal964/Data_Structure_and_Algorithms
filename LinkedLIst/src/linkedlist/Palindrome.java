package linkedlist;

public class Palindrome {
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
    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // find midlle
        Node mid = findMidNode(head);

        // Reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // Check if equal
        while(right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        Palindrome ll = new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
    //    ll.addLast(1);

        ll.print();
        System.out.println("Check Given Linked List is Palindrome or Not: "+ ll.checkPalindrome());


    }
}
