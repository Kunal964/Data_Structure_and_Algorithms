import java.util.HashSet;

public class Count_Distinct_Elements {
    public static void main(String[] args) {
        int[] num = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for (int j : num) {
            set.add(j);
        }
        System.out.println("Ans = " + set.size());
     }
}
