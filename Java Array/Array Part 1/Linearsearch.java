
public class Linearsearch {

    public static int search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int key = 10;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found at pos: " + (index + 1));
        }
    }
}
