// important dude

public class Primenumbers {

    public static boolean primeornot(int n) {
        boolean isPrime = true;
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {// Math.....
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void print(int n) {
        for (int i = 2; i <= n; i++) {
            if (primeornot(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        print(1000);
    }
}
