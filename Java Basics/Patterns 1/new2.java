
public class new2 {

    public static void main(String args[]) {
        int x = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x);
                x ^= 1;
            }
            System.out.println();
        }
    }
}
// output
/*
 * 1
 * 01
 * 010
 * 1010
 * 10101
 */