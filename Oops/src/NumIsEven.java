import java.util.Scanner;

public class NumIsEven {
    public static void main(String[] args) {
        System.out.println("Enter you Number :");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        if (isEven(Num)) {
            System.out.println(Num + " Is Even Nuumber ");
        }
        else{
            System.out.println(Num + " Is not a Even Number ");
        }
    }
    public static Boolean isEven(int X){
        if (X%2 == 0) {
            return true;
            
        }
        return false;
    }
}
