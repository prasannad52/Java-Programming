
public class Countsetbits {

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            if ((1 & n) == 1) {// checking lsb
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(10));
    }
}
