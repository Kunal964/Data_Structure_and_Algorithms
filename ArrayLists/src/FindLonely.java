package ArraysLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class FindLonely {
    public static ArrayList<Integer> findlonelyElement(ArrayList<Integer> nums) {
        // lonely elements means if a number is 3, so on the left side of the num doesn't contain 2 and right side 4.
        // if(2, 3, 4) 3 is not lonely
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();

        Collections.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i != 0 && (nums.get(i - 1) == nums.get(i) - 1 || Objects.equals(nums.get(i - 1), nums.get(i)))) {  // checking the left side
                continue;
            }
            if (i != n - 1 && (nums.get(i + 1) == nums.get(i) + 1 || Objects.equals(nums.get(i + 1), nums.get(i)))) { // checking the right side
                continue;
            }

            // Ya toh left side ho ya right side koi si bi side adjacent element rkhti haa toh vo lonely nahi haa
            result.add(nums.get(i));
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            nums.add(input);
        }
        System.out.println(findlonelyElement(nums));

    }
}
