import java.util.Stack;

public class NextGreaterFromLeft {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        //  s.push(arr.length-1);
        int[] nextGreater = new int[arr.length];
        for (int i =0; i< arr.length; i++) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();  // pop if my top of the stack is greater than arr[i]
            }
            //2 if else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }else {
                nextGreater[i] = arr[s.peek()];
            }
            //3  push in s
            s.push(i);
        }
        for (int j : nextGreater) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
