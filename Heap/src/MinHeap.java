import java.util.*;

public class MinHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);

            int x = arr.size() - 1;
            int parent = (x-1)/2;
            while(arr.get(x) < arr.get(parent)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
                x = parent;
                parent = (x-1)/2;
            }
        }
        public int peek() {
            return arr.getFirst();
        }
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.getFirst();

            //Step 1
            int temp = arr.getFirst();
            arr.set(0, arr.getLast());
            arr.set(arr.size() - 1, temp);

            //Step 2
            arr.removeLast();

            //Step 3
            heapify(0);
            return data;

        }
        public boolean isEmpty() {
            return arr.isEmpty();
        }

    }



    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(8);
        pq.add(1);
        pq.add(5);
        pq.add(2);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }

}
