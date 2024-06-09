package sorting;

public class SelectionSort {
    // Selection Sort
    public static  void  SelectionSort(int[] arr) {
        // Pick the smallest(from the unsorted) put it at the beginning of the array.
        for (int i=0; i<arr.length-1;i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[min]>arr[j]) {
                    min = j;
                }
            }
            // Swaping
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }  public static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int[] arr = {6,3,9,8,2,5};
        SelectionSort(arr);
        printarr(arr);
    }

}
