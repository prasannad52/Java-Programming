//important dude

public class Binarytodecimal {

    public static int decimal(int n) {
        int dec = 0;
        int pow = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            dec = dec + rem * (int) Math.pow(2, pow);
            n = n / 10;
            pow++;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(decimal(111));

    }
}
