//important dude

public class Decimaltobinary {

    public static int binary(int n) {
        int bin = 0;
        int pow = 0;
        int rem;
        while (n > 0) {
            rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            n = n / 2;
            pow++;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(binary(7));
    }
}
