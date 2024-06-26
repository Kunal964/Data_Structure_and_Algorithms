package backtracking;

public class GridsCounts {
    public static int gridways(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;

        }
        // Kaam
        int W1 = gridways(i + 1, j, n, m);
        int W2 = gridways(i, j + 1, n, m);
        return W1 + W2;


    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridways(0, 0, n, m));
    }
}
