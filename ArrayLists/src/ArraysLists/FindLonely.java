package ArraysLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindLonely {
    public static  ArrayList<Integer> findlonelyelement(ArrayList<Integer> nums){
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();

        Collections.sort(nums);

        for (int i =0; i<n; i++) {
            if (i != 0 && (nums.get(i-1) == nums.get(i)-1 || nums.get(i-1) == nums.get(i))) {
                continue;
            }
            if (i != n-1 && (nums.get(i+1) == nums.get(i)+1 || nums.get(i+1) == nums.get(i))) {
                continue;
            }
            result.add(nums.get(i));
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i =0; i<n; i++) {
            int input = sc.nextInt();
            nums.add(input);
        }
        System.out.println(findlonelyelement(nums));

    }
}
