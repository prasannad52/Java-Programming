public class GridWays {
    public static int grid(int i, int j, int m, int n) {
        // condition for base case
        if (i == m - 1 && j == n - 1) {// condition for last call
            return 1;
        } else if (i == m || j == n) {// boundary cross condition
            return 0;
        }
        int w1 = grid(i + 1, j, m, n);
        int w2 = grid(i, j + 1, m, n);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(grid(0, 0, m, n));
    }
}