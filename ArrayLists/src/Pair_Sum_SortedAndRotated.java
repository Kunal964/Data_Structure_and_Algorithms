package ArraysLists;

import java.util.ArrayList;

public class Pair_Sum_SortedAndRotated {
    public static boolean PairSum(ArrayList<Integer> List, int Target) {
        // Find Breaking Point
        int n = List.size();
        int Bp = -1;
        for (int i = 0; i < n; i++) {
            if (List.get(i) > List.get(i + 1)) {
                Bp = i;
                break;
            }
        }
        int Lp = Bp + 1;  // Smallest
        int Rp = Bp;   // Largest
        while (Lp != Rp) {
            //  Case 1
            if (List.get(Lp) + List.get(Rp) == Target) {
                return true;
            }
            // Case 2
            else if (List.get(Lp) + List.get(Rp) < Target) {  // Here I'm using modular for left pointer as well as right pointer.
                Lp = (Lp + 1) % n;                                                    // Every rotated Array or list use modulo
            }
            // Case 3
            else if (List.get(Lp) + List.get(Rp) > Target) {
                Rp = (n + Rp - 1) % n;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);
        System.out.println(PairSum(List, 16));
    }
}
