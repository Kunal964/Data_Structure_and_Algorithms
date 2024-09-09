import java.util.HashSet;

public class Intersection_And_Union {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> hs = new HashSet<>();

        //Union
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        System.out.print("Union = ");
        for (int num : hs) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Intersection
        hs.clear();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        System.out.print("Intersection = ");
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                hs.remove(arr2[i]);
            }
        }
        System.out.println();
    }
}
