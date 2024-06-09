package RecursioBasics;

public class FibonacciByRecursion {
    public  static int Fibonacci(int n)
    {
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = Fibonacci(n-1);
        int f2 = Fibonacci(n-2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}
