// this should be dry run every time when you read

public class Countingdescending {

    public static void sorting(int numbers[]) {
        int largest = Integer.MIN_VALUE;// finding out the largest element in the array
        for (int i = 0; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
        }

        // counting the element of same time appearing element in numbers represent the index in count
        int count[] = new int[largest + 1];
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]]++;
        }

        // then finally sorting them using count
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                numbers[j] = i;
                j++;
                count[i]--;
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
