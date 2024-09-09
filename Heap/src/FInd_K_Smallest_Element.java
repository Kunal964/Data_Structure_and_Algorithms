import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FInd_K_Smallest_Element {
    public static List<Integer>  findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int integer : arr) {
            if (k>0) {
                minHeap.offer(integer);
                k--;
            }
            else if (Math.abs(minHeap.peek() - x) > Math.abs(integer - x)) {
                minHeap.poll();
                minHeap.offer(integer);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while( !minHeap.isEmpty() ) {
            ans.add(minHeap.poll());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findClosestElements(arr,4,3));
    }
}
