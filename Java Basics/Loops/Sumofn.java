
import java.util.*;

public class Sumofn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int counter = 1, sum = 0;
        while (counter <= n) {
            sum += n;
            counter++;
        }
        System.out.println(sum);
    }
}
