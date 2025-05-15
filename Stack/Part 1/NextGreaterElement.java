import java.util.*;

class NextGreaterElement {
    public static void nextGreater(int arr[], int result[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            // checking stack empty or not and also the elemen is greater than or not
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            // if stack is empty there is no greater element
            if (s.isEmpty()) {
                result[i] = -1;
            } else {// otherwise there exist an element greater than the presentS
                result[i] = arr[s.peek()];
            }
            // finally push the cur element index to the stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int result[] = new int[arr.length];// make result variable as nextGreater
        nextGreater(arr, result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}