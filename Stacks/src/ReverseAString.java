import java.util.Stack;

public class ReverseAString {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int indx = 0;
        while( indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()) {
            char ch = s.pop();
            result.append(ch);
        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverse("Kunal"));

    }
}
