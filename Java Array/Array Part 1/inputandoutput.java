
import java.util.*;

public class inputandoutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("phy: " + marks[0] + "\n" + "chem: " + marks[1] + "\n" + "math: " + marks[2]);
        System.out.println("Percentage: " + (marks[0] + marks[1] + marks[2]) / 3 + "%");
    }
}
