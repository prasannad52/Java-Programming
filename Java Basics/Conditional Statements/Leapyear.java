
import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.err.println("It is a leap year");
        } else {
            System.err.println("It is not a leap year");
        }
    }
}
