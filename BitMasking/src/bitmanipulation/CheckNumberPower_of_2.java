package bitmanipulation;

public class CheckNumberPower_of_2 {
    // Check Number is power of 2 or not
    //  N -> 8 - 1000 and N-1 -> 7 0111 1000 AND 0111 you got 0 that's means N is power of 2
    public static boolean CheckNumberispoweroftwo(int n) {
        return  (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(CheckNumberispoweroftwo(12));
    }
}
