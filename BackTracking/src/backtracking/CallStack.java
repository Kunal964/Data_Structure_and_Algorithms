package backtracking;

public class CallStack {
    public  static  void Changearr(int[] arr, int i, int val){
        // base case
        if (i == arr.length){
            Printarr(arr);
            return;
        }
        // kaam
        arr[i] = val;
        Changearr(arr, i+1,val+1);  // function call step
        arr[i] = val-2; //  backtracking step

    }

    public static void Printarr(int[] arr){
        for (int j : arr) {  // one by one arr values store in j
            System.out.print(j);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Changearr(arr, 0, 1);
        Printarr(arr);
    }
}
