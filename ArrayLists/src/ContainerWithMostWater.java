package ArraysLists;

import java.util.ArrayList;

public class ContainerWithMostWater {

    //Brute force approach    Time complexity 0(n^2)
//    public  static int StoreWater(ArrayList<Integer> height){
//        int maxWater = 0;
//
//        for(int i = 0; i<height.size(); i++){
//            for (int j =0; j<height.size(); j++){
//                int ht =  Math.min(height.get(i), height.get(j));
//                int width = j-i;
//                int CurrWater = ht * width;
//                maxWater = Math.max(maxWater, CurrWater);
//            }
//        }
//        return  maxWater;
//
//    }


    // 2 Pointer Approach   // Time Complexity 0(n)  because of linear
    public static int StoreWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int Lp = 0;  // Lp = Left Pointer
        int Rp = height.size() - 1; // Rp = Right Pointer
        while (Lp < Rp) {

            // Calculate water Area
            int ht = Math.min(height.get(Lp), height.get(Rp));
            int width = Rp - Lp;
            int CurrWater = ht * width;
            maxWater = Math.max(maxWater, CurrWater);

            if (height.get(Lp) < height.get(Rp)) {
                Lp++;
            } else {
                Rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1, 8, 6, 2, 5, 4, 8, 3, 6
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println("Total Area of Water Capture: " + StoreWater(list));


    }
}
