package ArraysLists;

import java.util.ArrayList;

public class PairOfSum {

    // Using Two Pointer Approach
    public static boolean PairofSum(ArrayList<Integer> list, int target){
        int Lp = 0;
        int Rp = list.size()-1;
        while(Lp < Rp){
            // Case 1
            if (list.get(Lp) + list.get(Rp) == target){
                return true;
            }
            // Case 2
            else if (list.get(Lp) + list.get(Rp) < target){
                Lp++;
            }
            // Case 3
            else if (list.get(Lp) + list.get(Rp) > target){
                Rp--;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(PairofSum(list, 10));


    }
}
