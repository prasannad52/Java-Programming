
import java.util.*;

public class Evenoroddsum {

    public static void main(String[] args) {
        int sumeven = 0, sumodd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n values");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter values");
            int x = sc.nextInt();
            if (x % 2 == 0) {
                sumeven += x;
            } else {
                sumodd += x;
            }
        }
        System.out.println("sum of even numbers " + sumeven);
        System.out.println("Sum of odd numbers " + sumodd);
    }
}
