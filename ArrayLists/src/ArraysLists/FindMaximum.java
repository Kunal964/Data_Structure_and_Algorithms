package ArraysLists;

import java.util.ArrayList;


public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(5);
        List.add(9);
        List.add(6);
        List.add(4);
        int max = Integer.MIN_VALUE;
        for (Integer integer : List) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println("Maximum Number in List: "+ max);

    }
}
