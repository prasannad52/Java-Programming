
import java.util.Scanner;

public class Week {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        switch (n) {
            case 1 ->
                System.err.println("Sunday");
            case 2 ->
                System.err.println("Monday");
            case 3 ->
                System.err.println("Tuesday");
            case 4 ->
                System.err.println("Wednesday");
            case 5 ->
                System.err.println("Thursday");
            case 6 ->
                System.err.println("Friday");
            case 7 ->
                System.err.println("Saturday");
            default ->
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
