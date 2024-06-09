package RecursioBasics;

public class FriendsPairingInRecursion {
    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single pair
        int fnm1 = friendspairing(n - 1);
        // Double Pair
        int fnm2 = (n - 1) * friendspairing(n - 2);  // n jab akele jata hai toh (n-1) ke sath pair kr skta hai or (n-1) (n-2) ke sath pair kr skta hai
        return  fnm1+fnm2;
    }

    public static void main(String[] args) {
        System.out.println(friendspairing(4));
    }
}
