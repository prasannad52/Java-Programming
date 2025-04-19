
public class TilingProblem {

    public static int Til(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // Til(n-1) is for verticleplacing and Til(n-2) is for horizontal placing
        return Til(n - 1) + Til(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Til(4));
    }
}
