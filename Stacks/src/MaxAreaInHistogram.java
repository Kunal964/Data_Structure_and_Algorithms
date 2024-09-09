import java.util.Stack;

public class MaxAreaInHistogram {
    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i>=0; i--) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();  // remove the small element from the stack
            }
            //2 if else
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }
            //3  push in s
            s.push(i);
        }

        // Next Smaller left
        s = new Stack<>();
        for (int i = 0; i<arr.length; i++) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();  // remove the small element from the stack
            }
            //2 if else
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else {
                nsl[i] = s.peek() ;
            }
            //3  push in s
            s.push(i);
        }

        // Current Area: Width = j-i-1 = nsr[i] - nsl[i] -1
        for (int i =0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.println("Max Area in Histogram = "+ maxArea);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3}; // Heights in Histogram
        maxArea(arr);
    }
}