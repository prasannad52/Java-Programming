
import java.util.*;

public class AreaofCircle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r = sc.nextFloat();
        float area = (float) 3.14 * r * r;
        System.out.println("Area of the circle is " + area);
        sc.close();
    }
}
// or 3.14f
