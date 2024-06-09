package StringsBasics;

public class CheckStringAreEquals {
    public static void main(String[] args) {
        String str1 = "KUNAL";
        String str2 = "KUNAL";
        String str3 = new String("KUNAL");
        if (str1 == str2){
            System.out.println("Strings Are Equals");
        }
        else {
            System.out.println("Strings Are Not Equals");
        }
//        if(str1 == str3){
//            System.out.println("Strings Are Equals");
//        }
//        else {
//            System.out.println("Strings Are Not Equals");
//        }
        if (str1.equals(str3)){
            System.out.println("Strings Are Equals");
        }
        else {
            System.out.println("Strings Are Not Equals");
        }


    }
}
