
public class Sumofdigits {

    public static int sum(int n) {
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(123));
    }
}
