public class RemoveElementsFromSortedArrays {
    public static int RemoveDuplicates(int[] nums){
        int i = 0;
        for (int j =i+1;j<nums.length;j++){
            if (nums[i]<nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
            }

        }
        return i+1;  // Return the length of the array
    }
    public static  void Printarr(int[] nums , int length){
        for (int k = 0; k<length; k++){
            System.out.print(nums[k]);
        }
    }

    public static void main(String[] args) {
        int[] nums= {0,1,1,2,2,2,3,3,3,3,4,4,4,4,4,4,5,5,5,5,6,6,6};
        int length = RemoveDuplicates(nums);
        Printarr(nums ,length);

    }
}
