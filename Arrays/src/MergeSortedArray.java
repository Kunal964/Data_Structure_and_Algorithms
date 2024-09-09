public class MergeSortedArray {
    public static  void MergeSortedArrays(int[] nums1, int[] nums2, int m, int n){
        int i = m-1;  // i indicate nums1 m-1 index
        int j = n-1;   // j indicate nums2 n-1 index
        int k = m+n-1;    // k indicate nums1 last index
        while(i>=0 && j>=0){
            if (nums1[i]>nums2[j]){
                // Swapping the last index value with nums1
                nums1[k] = nums1[i];
                k--; i--;
            }
            else {
              //  Swapping the last index value with nums1
                nums1[k] = nums2[j];
                j-- ; k--;
            }
        }
        while(j>=0){
            nums1[k] = nums2[j];  // another while condition is used because if i goes out of index and j remain
            j-- ; k--;
        }
    }

    public static void main(String[] args) {
        int m =3;
        int n =3;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        MergeSortedArrays(nums1,nums2,m,n);
        for (int i = 0 ; i<6; i++){
            System.out.print(nums1[i]);
        }
    }
}
