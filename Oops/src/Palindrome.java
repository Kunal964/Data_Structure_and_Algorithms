import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter you Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is palindrome");            
        }
        else{
            System.out.println(num + " Number is not plaindrome");
        }
    }
    public static Boolean isPalindrome(int Number){
        int temp = Number;
         int reverse = 0;
        while (temp>0) {
         int rem = temp%10;
         reverse = reverse*10 + rem;
         temp = temp/10;   
        }
        if (Number == reverse) {
            return true;
            
        }
        return false;
    }
}
