import java.util.*;

public class solvesudoko {

    public static void main(String[] args) {

        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("No solution");
        }
    }

    static boolean solve(int[][] board) {

        int row = -1;
        int col = -1;
        boolean empty = true;

        // Find empty cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    empty = false;
                    break;
                }
            }

            if (!empty) {
                break;
            }
        }

        // No empty cell = Sudoku solved
        if (empty) {
            return true;
        }

        // Try numbers 1 to 9
        for (int num = 1; num <= 9; num++) {

            if (isSafe(board, row, col, num)) {

                board[row][col] = num;

                if (solve(board)) {
                    return true;
                }

                // Backtrack
                board[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3 x 3 box
        int sq = (int) Math.sqrt(board.length);

        int startRow = row - row % sq;
        int startCol = col - col % sq;

        for (int i = startRow; i < startRow + sq; i++) {
            for (int j = startCol; j < startCol + sq; j++) {

                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    static void display(int[][] board) {

        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}