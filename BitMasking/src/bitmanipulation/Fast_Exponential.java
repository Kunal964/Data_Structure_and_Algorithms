package bitmanipulation;

public class Fast_Exponential {
    // fast Exponential of any number
    public static  int fastExponential(int a , int n){
        int ans = 1;
        while( n>0){
            if ((n&1)!=0){
                // if value has got 1 than do (Ans*A) and store it into A.
                ans = ans*a;
            }
            // Here you got A^2
            a = a*a;
            // Doing right shift
            n = n>>1;
        }
        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExponential(5,3));
    }
}
