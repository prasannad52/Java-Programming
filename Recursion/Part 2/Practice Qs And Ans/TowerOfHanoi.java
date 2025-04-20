// important check it out dude

public class TowerOfHanoi {
    public static void tower(int n, char A, char B, char C) {
        if (n == 0) {
            return;
        }
        tower(n - 1, A, C, B);
        System.out.println(A + " to " + C);
        tower(n - 1, B, A, C);
    }

    public static void main(String[] args) {
        tower(2, 'A', 'B', 'C');
    }
}