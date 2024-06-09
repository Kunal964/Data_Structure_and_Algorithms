package bitmanipulation;

public class Update_ith_Bit {
    public static int updateithbit(int n , int i , int newbit){
        // n = ClearithBit(n,i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(updateithbit(10,2,1));
    }
}
