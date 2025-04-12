
import java.util.*;

public class Incometax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        if (salary < 500000) {
            System.out.println("No tax");
        } else if (salary > 500000 && salary < 1000000) {
            System.out.println(salary * 0.2);
        } else {
            System.out.println(salary * 0.3);
        }
    }
}
