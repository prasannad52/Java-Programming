
public class Clearithbit {

    public static int bit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println(bit(n, i));
    }
}
