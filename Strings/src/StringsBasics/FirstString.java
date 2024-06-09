package StringsBasics;

import java.util.Scanner;

public class FirstString {
     public static  boolean CheckPalindrome(String str){
         int n = str.length();
         for(int i =0;i<n/2;i++){
             if (str.charAt(i) != str.charAt(n-i-1)){
                 return false;
             }
         }
         return true;
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String str = sc.nextLine();
        System.out.println(CheckPalindrome(str));


    // Concatenate
//        String firstname = "Kunal";
//        String lastname = "Chaudhary";
//        String Fullname = firstname + " "+ lastname;
//        System.out.println(Fullname);
    }


}
