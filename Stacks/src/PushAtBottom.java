import java.util.Stack;

public class PushAtBottom {
    public static void pushbottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushbottom(s,data);  // Here recursion perform
        s.push(top); // top data push into s
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushbottom(s,top);   // push the first element at the last
    }
 public static void printStack(Stack<Integer> s) {
     while(!s.isEmpty()) {
         System.out.println(s.pop());
     }

 }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

      
        reverse(s);
        System.out.println("Stack After Reverse");
        printStack(s);
    }
}
