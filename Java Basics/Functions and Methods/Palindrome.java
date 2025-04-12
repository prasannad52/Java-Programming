// important

public class Palindrome {

    public static boolean pali(int n) {
        int rev = 0;
        int original = n;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = rem + rev * 10;
            n = n / 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        System.out.println(pali(111));
    }
}
