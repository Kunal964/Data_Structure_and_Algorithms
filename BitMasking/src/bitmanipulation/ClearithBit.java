package bitmanipulation;

public class ClearithBit {
    public  static  int ClearithBit(int n, int i){
        int Bitmask = (1<<i);
        return n | Bitmask;
    }

    public static void main(String[] args) {
        System.out.println(ClearithBit(5,1));
    }
}
