
public class Maxsubarray {

    public static int result(int number[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + number[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5};
        System.out.println(result(numbers));
    }
}
