
import java.util.*;

public class Reverseofnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n valu");
        int n = sc.nextInt();
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            System.out.print(rem);
        }
    }
}
