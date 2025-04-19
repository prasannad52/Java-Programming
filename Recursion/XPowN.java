public class XPowN {
    public static int res(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * res(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(res(2, 4));
    }
}
