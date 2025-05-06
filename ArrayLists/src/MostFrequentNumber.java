package ArraysLists;

import java.util.ArrayList;
import java.util.Scanner;
// Question kehra haa array mai key find ho jati haa agr toh uske next element(target)
// mai jo bi haa uski frequency sabse jyada ari usko return krd0

public class MostFrequentNumber {
    public static int MaxOccurOfElement(ArrayList<Integer> nums, int key) {
        int[] count = new int[1001];

        // Building our counting array
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == key) {
                count[nums.get(i + 1)]++;
            }
        }
        // Finding the maximum index of the greatest entry
        int maxValue = 0;
        int target = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxValue) {
                target = i;   // initialize the index of the greatest entry
                maxValue = count[i];  // initialize the value of the greatest entry
            }
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Key = input.nextInt();
        int n = input.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            nums.add(num);
        }

        System.out.print(MaxOccurOfElement(nums, Key));
    }
}
