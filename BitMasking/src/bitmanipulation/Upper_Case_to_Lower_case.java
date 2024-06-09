package bitmanipulation;

public class Upper_Case_to_Lower_case {
    public static void UppercaseToLowercase(){
        for (char ch = 'A'; ch<='Z'; ch++){
            System.out.println("Character " + ch + " from Upper to Lowercase :" + (char)(ch | ' ')); // Doing OR ch with empty space because ASCII value of Empty space is 32bit
        }
    }

    public static void main(String[] args) {
        UppercaseToLowercase();
    }
}
