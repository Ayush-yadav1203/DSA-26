import java.util.*;

public class knight {

    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];

        int count = knight(board, 0, 0, 4);

        System.out.println("Total solutions: " + count);
    }

    static int knight(boolean[][] board, int row, int col, int knights) {

        // All knights placed
        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }

        // Board finished
        if (row == board.length) {
            return 0;
        }

        // Move to next row
        if (col == board.length) {
            return knight(board, row + 1, 0, knights);
        }

        int count = 0;

        // Place knight
        if (isSafe(board, row, col)) {

            board[row][col] = true;

            count += knight(board, row, col + 1, knights - 1);

            // Backtrack
            board[row][col] = false;
        }

        // Don't place knight
        count += knight(board, row, col + 1, knights);

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {

        return row >= 0 &&
               row < board.length &&
               col >= 0 &&
               col < board.length;
    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {

            for (boolean ele : row) {

                if (ele) {
                    System.out.print("K ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }
    }
}