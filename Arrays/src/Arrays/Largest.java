package Arrays;

public class Largest {

    public static int getLargest(int[] Number){
        int  largest = Integer.MIN_VALUE; // -infinity
        int  smallest = Integer.MAX_VALUE;  // infinity
        for(int i =0; i<Number.length; i++){
            if (largest<Number[i]) {
                largest = Number[i];
            }
            if (smallest>Number[i]) {
                smallest = Number[i];
            }

        }
        System.out.println("Smallest Number in Array is : "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        int[] Number = {1, 2, 4, 6, 7, 9};
        System.out.println("Largest Number in Array is: " +getLargest(Number));
    }

}
