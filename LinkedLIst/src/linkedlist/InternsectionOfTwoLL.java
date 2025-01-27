package linkedlist;

public class InternsectionOfTwoLL {
    static class  Node {
        int val;
        Node next;  

        public Node(int data) {
            this.val = data;
            this.next = null;    
        }
    }

    public Node tail;
    public Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if( head == null) {
            head = tail = newNode;
            return;
        }
        //Step 2 
        tail.next = newNode;
        
        //Step 3
        tail = newNode;
    }

    static Node intersect(Node l1, Node l2) {
        if(l1 == null || l2 == null) return null;

        Node p1 = l1, p2 = l2;

        while(p1 != p2) {
            p1 = p1 == null ? l2 : p1.next;
            p2 = p2 == null ? l1 : p2.next;
        }
        return p1;
    }
    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next; 
        }
    }

    public static void main(String[] args) {
        InternsectionOfTwoLL l1 = new InternsectionOfTwoLL();
        l1.addLast(1);
        l1.addLast(2);
      

        InternsectionOfTwoLL l2 = new InternsectionOfTwoLL();
        l2.addLast(5);
        
       Node shared = new Node(3);
       shared.next = new Node(4); 

       //Link Both Shared Linked List
       l1.tail.next = shared;
       l2.tail.next =  shared;
       l1.Print();
       System.out.println();
       l2.Print();
     

       //Finding Intersection
       Node intersection = intersect(l1.head, l2.head);
       if (intersection != null) {
        System.out.println("Intersection at Node with value: " + intersection.val);
     }
     else {
        System.out.println("Intersection Not Found");
     }

        
    }

}

