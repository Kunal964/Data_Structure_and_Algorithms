import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n= sc.nextInt();
        if (n==2) {
            System.out.println( n +" is Prime");
            
        }
        else{
            Boolean isprime = true;
            for( int i=2; i<=n-1; i++){
                if (n%2==0) {
                    isprime = false;
                }

            }
            if (isprime==true) {
                System.out.println(n +" is prime");
                
            }
            else{
                System.out.println(n +" is not a prime");
            }

            }
    
        }
    }
    
