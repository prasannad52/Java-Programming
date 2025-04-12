
public class Question2 {

    public static int sum(int mat[][]) {
        int res = 0;
        for (int j = 0; j < mat[0].length; j++) {
            res += mat[1][j];
        }
        return res;
    }

    public static void main(String[] args) {
        int mat[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        System.out.println(sum(mat));
    }
}
