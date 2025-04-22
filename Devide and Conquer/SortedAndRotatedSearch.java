public class SortedAndRotatedSearch {
    public static int search(int arr[], int target, int si, int ei) {

        // kaam
        int mid = si + (ei - si) / 2;

        // case found
        if (target == arr[mid]) {
            return mid;
        }
        // L1 line
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        }
        // L2 line
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 0, 1, 2, 3 };
        int index = search(arr, 0, 0, arr.length - 1);
        System.out.println(index);
    }
}