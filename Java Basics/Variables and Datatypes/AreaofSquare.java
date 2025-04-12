
import java.util.*;

public class AreaofSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of the square");
        float side = sc.nextFloat();
        float area = side * side;
        System.err.println("Area of the square is " + area);
        sc.close();
    }
}
