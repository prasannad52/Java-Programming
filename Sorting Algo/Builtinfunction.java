
import java.util.*;

public class Builtinfunction {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 56, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        // also we have Arrays.sort(arr,sindex,eindex);
        // also we can use comparator in collections
        // from collection we can also print the array in descending as well as ascending order
    }
}
