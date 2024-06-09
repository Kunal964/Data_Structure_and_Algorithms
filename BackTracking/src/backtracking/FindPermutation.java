package backtracking;

public class FindPermutation {
    public  static void Permutation(String str, String ans){
        // base case
        if (str.isEmpty()){
            System.out.println(ans);
        }
        // kaam
        for (int i = 0; i<str.length();i++){
            char curr = str.charAt(i);
            // "abcde" = "ab"+"de" = "abde"
            String NewStr = str.substring(0,i) + str.substring(i+1);
            Permutation(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        Permutation(str,"");

    }
}
