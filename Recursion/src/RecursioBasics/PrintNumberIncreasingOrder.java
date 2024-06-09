package RecursioBasics;

public class PrintNumberIncreasingOrder {
    public static void IncOrder(int n){
        if (n==1){
            System.out.print(1 + " ");
            return;
        }
        IncOrder(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        IncOrder(20);
    }
}
