package sorting;

public class CountingSort {
    // Counting Sort
    public static  void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length;i++) {
            largest = Math.max(largest, arr[i]);
        }
        // initialize the Count array index
        int[] Count = new int[largest +1];
        for (int i = 0; i<arr.length;i++) {
            // Arr[] value became the count array index
            // values ki  frequency print krvne ke liye
            Count[arr[i]]++;
        }
        // Sorting
        int j = 0;
        for (int i = 0; i<Count.length;i++) {
            while(Count[i]>0){
                arr[j] = i;
                j++;
                Count[i]--;
            }
        }


    }
    public static void printarr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int[] arr = {6,3,9,8,2,5};
        countingSort(arr);
        printarr(arr);
    }

}
