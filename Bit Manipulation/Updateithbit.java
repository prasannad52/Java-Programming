// important dude

public class Updateithbit {

    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int bit(int n, int i, int newBit) {
        n = clear(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int newBit = 1;
        System.out.println(bit(n, i, newBit));
    }
}
