package RecursioBasics;

public class SumOfNumbers {
    public static  int SumNum(int n){
        if (n==1){
            return 1;
        }
        int s = SumNum(n-1);
        System.out.println("Value of s " + s);
        System.out.println("Value of n " + n);
        return n+s;
    }

    public static void main(String[] args) {
        System.out.println(SumNum(5));
    }
}
