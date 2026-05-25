package Algorithms;
public class Backtracking {
    public static void main(String[] args) {
        int n = 4; // Size of the chessboard
        int[][] board = new int[n][n];
        solveNQ(board, 0);
    }
    public static boolean solveNQ(int[][] board, int row) {
        int n = board.length;
        if (row >= n) {
            printBoard(board);
            return true;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen
                if (solveNQ(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;
        // Check this column on upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // Check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}