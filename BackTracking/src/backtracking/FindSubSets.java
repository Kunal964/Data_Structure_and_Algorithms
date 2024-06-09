package backtracking;

public class FindSubSets {
    public static void FindSets(String str, String ans, int i){
        if (i == str.length()){
            if (str.isEmpty()){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //kaam
        FindSets(str,ans+str.charAt(i),i+1);
        FindSets(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        String ans = "";
        FindSets(str,ans,0);
    }
}
