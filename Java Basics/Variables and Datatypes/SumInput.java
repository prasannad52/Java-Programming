
import java.util.*;

public class SumInput {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int product = a * b;
        int div = a / b;
        System.out.println("Sum of a and b value is " + sum);
        System.out.println("substraction of a and b value is " + sub);
        System.out.println("Product of a and b value is " + product);
        System.out.println("divison of a and b value is " + div);
        sc.close();
    }
}
