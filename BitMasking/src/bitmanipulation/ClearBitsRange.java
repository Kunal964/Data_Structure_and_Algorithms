package bitmanipulation;

public class ClearBitsRange {
    public static int clearbitsinrange(int n, int i , int j) {
        int a =((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask  = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearbitsinrange(5,1,2));
    }
}
