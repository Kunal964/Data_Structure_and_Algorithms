package ArraysLists;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoNumbersInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(3);
        // Swap
        int temp = list.get(1);
        list.set(1, list.get(3));  // set method is used to set the value in an array list
        list.set(3, temp);
        System.out.println(list);

        // sorting in list
        Collections.sort(list);
        System.out.println(list);

        // sorting in Decreasing order
        // Collections.sort(list, Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
