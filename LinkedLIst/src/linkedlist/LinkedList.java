package linkedlist;

public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static  Node head;
    public static  Node tail;
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
        // addfirst mai newNode ka next head ko point krta hai or newnode head ban jati hai
        // means jo last mai aya sabse phle vo print hoga
        // yha pr tail fix ho jati hai head aga jata rheta hai
        // basically address assign hora ha bss
    }
   
   public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

   }

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
   // tail ka next newNode ko point krta hai or newnode tail ban jati ha
   // yha pr head fix ho jata ha tail forward hota rehta hai
}
   public int removeLast() {
       if (size == 0) {
           System.out.println("LL is Empty");
           return Integer.MIN_VALUE;
       } else if (size == 1) {
           int val = head.data;
           head = tail = null;
           size = 0;
           return val;
       }
       // find prev : i = Size-2 , Size-1 = tail;
       Node prev = head;  // assign head value into prev
       for (int i = 1; i<size-1; i++) {
           prev = prev.next; // Prev ko step by step forward krdiya
       }
       int val = prev.next.data; // tail.data
       prev.next = null; // terminate the connection btw prev.next and tail
       tail = prev;
       size--;
       return val;
   }

   public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if (temp.data == key) { // Key Found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Key not Found
       return -1;
   }
   public int search(Node head, int key, int i) {   // Searching key using recursion
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return i;

        }
       return search(head.next,key,i+1);  // search function mai jo bi return hora upper vhi value wapis return hori


   }
   public void reverse() {   // Reverse Linked List
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;   // Right ki value jo ha vo left ki banri ha
            // curr.next jis node ko point kr rha usse next  bna do
            curr.next = prev;  // prev ko curr.next bna do  , Right value left mai assign hogi
            prev = curr;
            curr = next;
        }
        head = prev;

   }


   public void add(int indx, int data) {
        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < indx-1) { // newNode ko add krne ke liye prev.next sey connect kr denge
           temp = temp.next;
           i++;
        }
        // i = indx-1; temp -> prev
       newNode.next = temp.next;
        temp.next = newNode;
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
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(4,5);
        ll.print(); // 1->2->3->4->5
        System.out.println("Size of the Linked List "+size);
        System.out.println(ll.removeFirst());
         ll.print();
//
        System.out.println(ll.removeLast());
//        ll.print();
 //       System.out.println(ll.itrSearch(3));
//        System.out.println(ll.itrSearch(6));
//        System.out.println(ll.search(head,4,0));

      //  ll.reverse();
        ll.print();
        ll.reverse();
        ll.print();



    }
}
