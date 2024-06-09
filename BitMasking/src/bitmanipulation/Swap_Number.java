package bitmanipulation;

public class Swap_Number {
    // SWap two Number Without Using Third variable
    public  static  void Swapnumber(int x , int y){

        System.out.println("X before swapping: " + x);
        System.out.println("Y before swapping: " +y);

        // Bitwise XOR operator
        x = x^y; // 1010^0101  = 1111
        y = y^x;  // 0101^1111 = 1010 = 10 -> y^x^y -> y^y =0 , (y = x)
        x = x^y;  // 1111^1010 = 0101 =5 -> x^y^x -> x^x = 0 , (x=y)
        System.out.println("X After swapping: " + x);
        System.out.println("Y after Swapping: "+ y);

    }

    public static void main(String[] args) {
        Swapnumber(10,5);
    }
}
