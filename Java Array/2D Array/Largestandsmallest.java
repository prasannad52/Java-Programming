
import java.util.*;

public class Largestandsmallest {

    public static void printing(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void largeandsmall(int matrix[][]) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                large = Math.max(matrix[i][j], large);
                small = Math.min(matrix[i][j], small);
            }
        }
        System.out.println("Largest number is " + large);
        System.out.println("Smallest number is " + small);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printing(matrix);
        largeandsmall(matrix);
    }
}
