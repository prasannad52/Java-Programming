
public class Invertedhalfpyramidnumber {

    public static void inverted(int n) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted(5);
    }
}
// output
/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */