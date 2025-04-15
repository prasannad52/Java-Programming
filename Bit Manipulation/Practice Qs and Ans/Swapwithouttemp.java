
public class Swapwithouttemp {

    public static void main(String[] args) {
        int x = 4;
        int y = 8;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);
    }
}
