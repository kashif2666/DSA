// Count the no. of solution for N knight problem

public class Q4 {
  public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    int totalSolutions = knight(board, 0, 0, n);
    System.out.println("Total number of solutions: " + totalSolutions);
  }

  static int knight(boolean[][] board, int row, int col, int knights) {
    if (knights == 0) {
      return 1;
    }

    if (row == board.length) {
      return 0;
    }

    if (col == board.length) {
      return knight(board, row + 1, 0, knights);
    }

    int count = 0;

    if (isSafe(board, row, col)) {
      board[row][col] = true;
      count += knight(board, row, col + 1, knights - 1);
      board[row][col] = false;
    }

    count += knight(board, row, col + 1, knights);

    return count;
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
      return false;
    }
    if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
      return false;
    }
    if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
      return false;
    }
    if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
      return false;
    }
    return true;
  }

  static boolean isValid(boolean[][] board, int row, int col) {
    return row >= 0 && row < board.length && col >= 0 && col < board.length;
  }
}

