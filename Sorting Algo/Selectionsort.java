
public class Selectionsort {

    public static void sorting(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minpos] > numbers[j]) {
                    minpos = j;
                }
            }
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            numbers[i] = temp;
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
