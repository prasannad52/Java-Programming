
public class Getithbit {

    public static int bit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        System.out.println(bit(n, i));
    }
}
