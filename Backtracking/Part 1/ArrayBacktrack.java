public class ArrayBacktrack {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void backtrack(int arr[], int i, int val) {
        if (i == arr.length) {// base case
            print(arr);
            return;
        }
        arr[i] = val;// kaam
        backtrack(arr, i + 1, val + 1);// function call
        arr[i] -= 2;// backtracking
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrack(arr, 0, 1);
        print(arr);
    }
}