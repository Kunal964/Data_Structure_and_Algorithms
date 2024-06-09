package RecursioBasics;

public class PrintNumberDecreasingOrder {
    public  static  void DecOrder(int n){
        if (n==1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        DecOrder(n-1);
    }

    public static void main(String[] args) {
        DecOrder(20);
    }
}
