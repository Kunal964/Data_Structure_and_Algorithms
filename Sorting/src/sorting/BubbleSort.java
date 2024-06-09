package sorting;

public class BubbleSort {
    // Bubble Sort
    public  static  void bubblesort(int[] arr) {
        for (int turn =0;turn<=arr.length-2;turn++) {
            for (int j=0; j<=arr.length-2-turn;j++) {
                if (arr[j]>arr[j+1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubblesort(arr);
        printarr(arr);
}

}
