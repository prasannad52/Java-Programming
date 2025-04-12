
public class Bubbledescending {

    public static void sorting(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void printing(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sorting(numbers);
        printing(numbers);
    }
}
