
import java.util.*;

public class Multiply {

    public static int Multipclication(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = Multipclication(a, b);
        System.out.println("Mul = " + mul);
    }
}
