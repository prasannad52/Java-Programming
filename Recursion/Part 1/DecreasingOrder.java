
public class DecreasingOrder {

    public static void print(int n) {
        if (n == 1) {//base condition
            System.out.println(n + "  ");
            return;
        }
        System.out.print(n + "  ");
        print(n - 1);
    }

    public static void main(String args[]) {
        int n = 10;
        print(n);
    }
}
