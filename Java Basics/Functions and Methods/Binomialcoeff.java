
public class Binomialcoeff {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void Bincoeff(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        System.err.println(a / (b * c));
    }

    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        Bincoeff(n, r);
    }
}
