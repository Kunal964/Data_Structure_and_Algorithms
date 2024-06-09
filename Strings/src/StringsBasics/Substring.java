package StringsBasics;

public class Substring {
    public  static String Substring(String str, int left, int right){
        String substr = "";
        for(int i = left; i<right; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HELLO WORLD";
//        System.out.println(str.substring(0,5));
//        System.out.println(Substring(str,0,5));
        String s = "hello";
        String t = s;
        s ="wolrd";
        System.out.println(t);
        System.out.println(s);

    }
}
