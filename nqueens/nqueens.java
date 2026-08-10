package nqueens;
import java.util.*;

public class nqueens {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        boolean[][] board = new boolean[n][n];

        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {

        // All queens are placed
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // Place queen
                board[row][col] = true;

                count += queens(board, row + 1);

                // Backtrack
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }

        // Check upper-left diagonal
        int maxLeft = Math.min(row, col);

        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i])
                return false;
        }

        // Check upper-right diagonal
        int maxRight = Math.min(row, board.length - col - 1);

        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i])
                return false;
        }

        return true;
    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {

            for (boolean ele : row) {

                if (ele) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }
    }
}
