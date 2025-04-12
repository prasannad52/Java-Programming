// practice it star = 3

public class Subarray {

    public static int[] array(int numbers[]) {
        int count = 0;
        int sum[] = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum_individul = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + "  ");
                    sum_individul += numbers[k];
                }
                sum[count++] = sum_individul;
                System.out.println();
            }
            System.out.println("");
        }
        System.out.println("Total number of sub arrays: " + count);
        return sum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        int sum[] = array(numbers);
        int max = 0;
        for (int i = 0; i < sum.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
            }
        }
        System.out.println("Maximum sum of subarray is : " + max);
    }
}
