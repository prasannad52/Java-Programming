
public class Binarysearch {

    public static boolean binary(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (matrix[i][mid] == key) {
                    System.out.print("Element found at pos " + i + "," + mid);
                    return true;
                } else if (matrix[i][mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        binary(matrix, 10);
    }
}
