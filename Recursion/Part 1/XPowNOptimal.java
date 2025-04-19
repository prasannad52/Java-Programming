public class XPowNOptimal {
    public static int optSol(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpow = optSol(a, n / 2);
        int halfpowsq = halfpow * halfpow;
        if (n % 2 != 0) {
            halfpowsq = a * halfpowsq;
        }
        return halfpowsq;
    }

    public static void main(String args[]) {
        System.out.println(optSol(2, 3));
    }
}