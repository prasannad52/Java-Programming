
public class Binarysearch {

    public static int search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;// this is important because it will give total length
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50};
        int key = 50;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("found at pos: " + index);
        }
    }
}
