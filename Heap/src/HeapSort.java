public class HeapSort {
    public static void heapify(int[] arr, int i, int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIndx = i;
        if(left < size && arr[left] > arr[maxIndx]) {
            maxIndx = left;
        }
        if(right < size && arr[right] > arr[maxIndx]) {
            maxIndx = right;
        }
        if (maxIndx != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = temp;
            heapify(arr, maxIndx, size);
        }
    }
    public static void heapSort(int[] arr) {
        // Step 1: Build Max Heap
        int n = arr.length;
        for(int i = n/2; i>=0; i--) {
            heapify(arr, i, n);
        }
        // Step 2: Push largest at the end
        for (int i = n-1; i>=0; i--) {
            // Swap largest-first with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,8,2,5};
        heapSort(arr);
        for (int j : arr) {
            System.out.print(j + "->");
        }
    }
}
