
import java.util.Scanner;

public class Special {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        String n = sc.next();
        switch (n) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.err.println("Weekdays");
                break;
            case "saturday":
            case "sunday":
                System.err.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
