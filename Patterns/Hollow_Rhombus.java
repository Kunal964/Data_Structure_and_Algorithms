package Patterns;

public class Hollow_Rhombus {
    public static void HollowRhombus(int n) {
        for(int i = 1; i <= n; i++) {
            //Spacces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }

            //hollow rectangle stars 
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        HollowRhombus(n);
    }

}
