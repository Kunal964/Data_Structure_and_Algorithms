package linkedlist;
import  java.util.LinkedList;
 public class Linked_List_Using_Collection_Framework {
     public static void main(String[] args) {

         // Create
         LinkedList<Integer> list = new LinkedList<>();

         // Adding the Data
         list.addLast(1);
         list.addLast(2);
         list.addFirst(0);
         // 0-->1-->2
         System.out.println(list);

         // Remove
         list.removeFirst();
         list.removeLast();
         System.out.println(list);

         //

     }


}