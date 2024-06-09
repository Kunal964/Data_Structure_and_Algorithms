package StringsBasics;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int inx = 0;
        while (inx<str.length()) {
            s.push(str.charAt(inx));
            inx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello ABC";
        System.out.println(reverseString(str));


    }
}
