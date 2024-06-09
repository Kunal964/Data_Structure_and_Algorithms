package bitmanipulation;

public class Count_Bit_Sets {
    // Count bit sets means count 1
    public  static  int CountBitSets(int n){
        int count = 0;
        while( n> 0){
            if ((n &1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountBitSets(4));
    }
}
