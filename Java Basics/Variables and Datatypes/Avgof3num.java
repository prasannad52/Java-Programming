
import java.util.*;

public class Avgof3num {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        System.out.println("Enter c value");
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Average of 3 numbers is " + avg);
    }
}
