package linkedlist;

public class MergeSortLinkedList {
    public static  class Node {
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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid Node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;  // head1 ka increment
                temp = temp.next;  //temp ka increment
            }
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;   // ek mergedll or temp linkedlist isi wjh sey bnayi thi mergedll ka next
                                // temp ke first  value ko point kr rha haa jo return hoga 
    }
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find Mid
        Node mid = getMid(head);
        // Left and right MS
        Node rightHead = mid.next; //mid ka next righthead bn jata hai 
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty ");
            return;
        }
          Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
     MergeSortLinkedList ll = new MergeSortLinkedList();
     ll.addFirst(1);
     ll.addFirst(3);
     ll.addFirst(6);
     ll.addFirst(4);
     ll.addFirst(5);
     ll.print();

     // 5-->4-->3-->2-->1
      head = ll.mergeSort(head);
      ll.print();
    }

}
