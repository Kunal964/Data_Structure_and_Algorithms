package sorting;

public class QuickSort {
    public static void Quicksort(int[] arr, int left , int right) {
        if(left>=right){
            return;
        }
        int pivotindx = partition(arr, left, right);
        Quicksort(arr, left, pivotindx-1);
        Quicksort(arr, pivotindx+1, right);
    }
    public static  int partition(int[] arr, int left , int right) {
        int pivot = arr[right];
        int i = left-1;
        for(int j = left; j<right; j++) {
            if (arr[j]<=pivot){
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        // Swap
        int temp = pivot;
        arr[right] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        Quicksort(arr,0, arr.length-1);
        printarr(arr);
    }

}
