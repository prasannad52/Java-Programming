public class NQueenSingleSolution {
    public static boolean isSafe(char board[][], int row, int j) {
        // verticle up checking
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal left checking
        for (int i = row - 1, k = j - 1; i >= 0 && k >= 0; i--, k--) {
            if (board[i][k] == 'Q') {
                return false;
            }
        }
        // diagonal right checking
        for (int i = row - 1, k = j + 1; i >= 0 && k < board.length; i--, k++) {
            if (board[i][k] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void print(char board[][]) {
        // printing the chess board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean chessBoard(char board[][], int row) {
        // base condition
        if (row == board.length) {
            // System.out.println("----------chess board---------");
            // print(board);
            return true;
        }
        // kaam
        for (int j = 0; j < board.length; j++) {
            // checking vertical up ,dig right and dig left
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (chessBoard(board, row + 1)) {
                    return true;
                } // function call
                board[row][j] = '*';// backtracking
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '*';
            }
        }
        if (chessBoard(board, 0)) {
            System.out.println("Solution exist");
            print(board);
        } else {
            System.out.println("solution doesn't exitsts");
        }
    }
}