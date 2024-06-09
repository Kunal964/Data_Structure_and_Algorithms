package sorting;

public class InsertionSort {
    // insertion sort
    public  static  void insertionsort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int  prev = i-1;
            // Finding out the correct pos to insert
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;  // jab while loop satisfy nhi hoga tab curr ki jo value fixed ha usko prev+1 mai store krdo.
        }
    }
    public static void printarr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int[] arr = {6,3,9,8,2,5};
        insertionsort(arr);
        printarr(arr);
    }
}
