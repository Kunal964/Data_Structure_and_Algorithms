public class Checkpalindrome {

    public  static void isPlaindrome(String str){
        for (int i = 0; i<str.length()/2; i++){
            if (str.charAt(i)!= str.charAt(str.length()-1-i)){
                System.out.println( str + " String is Not a Palindrome");
                return;
            }
        }

        System.out.println(str + " String is Palindrome");
    }

    public static void main(String[] args) {
        String str = "java";
        isPlaindrome(str);
    }



}
