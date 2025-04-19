public class LastOccurances {
    public static int search(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = search(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 6 };
        System.out.println(search(arr, 6, 0));
    }
}