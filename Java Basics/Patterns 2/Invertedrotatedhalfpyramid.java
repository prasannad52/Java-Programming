
public class Invertedrotatedhalfpyramid {

    public static void inverted(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        inverted(6);
    }
}
