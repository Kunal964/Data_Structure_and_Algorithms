package sorting;

public class MergeSort {
    // merge sort
    public static void mergesort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergesort(arr, left, mid); // Do faith on these recursive functions they provide a left sorted array and right sorted array
        mergesort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];  // creating the temp array where sorted elements store and this array length size depends on the size of the sorted elements
        int i = left; // Indexing for the 1st part of the array
        int j = mid + 1; // Indexing for the 2nd part of the array
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;

            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        while (j <= right) {
            temp[k++] = arr[j++];

        }

        for (k = 0, i = left; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }

    }

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
