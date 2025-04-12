
public class Spiralmatrix {

    public static void Spiral(int matrix[][]) {
        int startRow = 0;//initializing the first row
        int startCol = 0;//initializing the first col
        int endRow = matrix.length - 1;//initializing the last row
        int endCol = matrix[0].length - 1;//initializing the last col
        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(matrix[j][endCol] + " ");
            }
            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {// this is for overlapping of rows this already print in top
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                if (startCol == endCol) {// this is for overlapping of col this already print in right
                    break;
                }
                System.out.print(matrix[j][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        Spiral(matrix);
    }
}
