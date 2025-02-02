import java.util.PriorityQueue;

public class FInd_K_Largest_Element {
    static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int x : nums) {
            heap.add(x);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(kthLargest(nums, 2)); // k value indicate that we want K largest element like 2nd ,3rd or 1st largest
    }

}
