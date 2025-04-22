public class Mergesort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] >= arr[j]) {
                temp[k] = arr[j];
                j++;
            } else if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 34, 1, 6, 76, 33, 33 };
        mergeSort(arr, 0, arr.length - 1);
        print(arr);
    }
}