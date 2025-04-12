
import java.util.*;

public class Input {

    public static void main(String args[]) {
        System.out.println("Enter your full name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your full name is " + name);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
        System.out.println("Enter your salary");
        float salary = sc.nextFloat();
        System.out.println("Your salary is " + salary);
        sc.close();
    }
}
//nextDouble()
//nextLong()
//nextShort()
//nextByte
//nextBoolean()
