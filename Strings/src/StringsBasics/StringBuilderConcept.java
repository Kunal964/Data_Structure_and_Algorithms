package StringsBasics;

public class StringBuilderConcept {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);

        System.out.println(sb.replace(25,26,"k"));
        sb.insert(25,"o");
        System.out.println(sb);

    }
}
