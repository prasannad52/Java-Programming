
import java.util.*;

public class userbill {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil rate");
        float a = sc.nextFloat();
        System.out.println("Enter pen rate");
        float b = sc.nextFloat();
        System.out.println("Enter eraser rate");
        float c = sc.nextFloat();
        float bill = a + b + c + (a + b + c) * (float) 0.18;
        System.out.println("Average of 3 numbers is " + bill);
    }
}
