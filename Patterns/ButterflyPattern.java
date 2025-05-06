package Patterns;

public class ButterflyPattern {
    public static void Butterfly(int n) {
        //1st half of the pattern
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //Spaces 
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            //Stars 
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half of the pattern
        for(int i = n; i >= 1; i--) {
            //Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //Spaces 
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            //Stars 
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5;
        Butterfly(n);
    }

}
