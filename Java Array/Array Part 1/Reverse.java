
public class Reverse {

    public static void reverse(int numbers[]) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int temp = numbers[low];
            numbers[low] = numbers[high];
            numbers[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }
}
