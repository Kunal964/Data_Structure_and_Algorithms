package Patterns;

public class Diamond {
    public static void Diamond(int n) {
        //Upper half of the diamond
        for(int i = 1; i <= n; i++) {
            //Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //Stars
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower half of the diamond
        for(int i = n; i >= 1; i--) {
            //Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //Stars
            for(int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Diamond(n);
    }

}
