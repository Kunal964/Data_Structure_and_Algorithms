package RecursioBasics;

public class FactorialRecursion {
    public static int fact(int n) {
        // factorial
        if (n == 0) {   // base case
            return 1;
        }
        int fcm = fact(n - 1);
        System.out.println("Value of return fcm " + fcm);
        int fact1 = n * fcm;
        System.out.println("Value of n " + n);
        return fact1;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of the number " +fact(5));

        }

}
