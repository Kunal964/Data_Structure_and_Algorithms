package Patterns;

public class FlyodTriangle {
    public static void FlyodTriangle(int n) {

        int count = 1; // Initialize count to 1
        // Loop through rows

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " "); // Print the current count
                count++; // Increment count for the next number
            }
            System.out.println(); // Move to the next line after each row
        }
        
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows in the Floyd's triangle
        FlyodTriangle(n); // Call the method to print the triangle
    }

}
