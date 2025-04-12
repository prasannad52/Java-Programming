
import java.util.*;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature");
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("He has fever");
        } else {
            System.out.println("He has not fever");
        }
    }
}
