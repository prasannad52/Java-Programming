
public class Diagonalmatrix {

    public static void Diagonal(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // adding primary diagonal elements
            sum += matrix[i][i];
            // adding secondary diagonal elements
            sum += matrix[i][matrix.length - 1 - i];
        }
        System.out.print("Sum is " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        Diagonal(matrix);
    }
}
