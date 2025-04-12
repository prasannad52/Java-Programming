
import java.util.*;

public class Sum {

    public static int sumofnumbers(int a, int b) {//formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumofnumbers(a, b);// arguments or actual parameters
        System.out.println("Sum of numbers is " + sum);
    }
}
