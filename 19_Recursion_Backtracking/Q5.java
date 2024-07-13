// https://leetcode.com/problems/sudoku-solver/description/
public class Q5 {
  public static void main(String[] args) {
    int [][] board={ 
    {0, 0, 0, 0, 8, 0, 0, 1, 0},
    {0, 0, 0, 0, 7, 0, 0, 8, 2},
    {0, 0, 0, 5, 3, 6, 0, 0, 0},
    {0, 0, 8, 0, 0, 9, 0, 0, 0},
    {0, 7, 0, 6, 0, 0, 0, 0, 0},
    {0, 2, 0, 0, 0, 0, 9, 4, 0}, 
    {0, 0, 0, 0, 0, 0, 0, 0, 5},
    {3, 0, 5, 0, 0, 0, 8, 0, 0},
    {6, 0, 0, 0, 0, 7, 0, 0, 3}
   };

    if (solve(board)) {
      display(board);
      System.out.println(solve(board));
    }else{
      System.out.println("Cannot solve the sudoko");
    }
    
  }

  static boolean solve(int [][] board){
    int n=board.length;
    int row=-1;
    int col=-1;

    boolean emptyLeft=true;

    // this is how we are replacing the r,c from argument
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j]==0) {
          row=i;
          col=j;
          emptyLeft=false;
          break;
        }
      }

      // if you found empty element in row, then break
      if (emptyLeft==false) {
        break;
      }
    }
    if (emptyLeft==true) {
      return true;
      // sudoko is solved
    }

    for (int number = 1; number <= 9; number++) {
      if (isSafe(board, row, col, number)) {
        board[row][col]=number;
        if (solve(board)) {
          // found the answer
          return true;
        }else{
          // backtrack
          board[row][col]=0; 
        }
      }
    }

    return false;
  }

  private static void display(int[][] board) {
    for (int [] row : board) {
      for (int num : row) {
        System.out.print(num+" ");
      } 
      System.out.println();  
    }
  }

  static boolean isSafe(int[][] board,int row,int col, int num){
    // check the row
    for (int i = 0; i < board.length; i++) {
        // check if the num is in the row
        if (board[row][i]==num) {
          return false;
        }
    }

      // check the column
      for (int[] nums: board) {
        // check if the num is in the col
        if (nums[col]==num) {
          return false;
        }
    }
// check the sub box 3*3
    int sqrt=(int)(Math.sqrt(board.length));
    int rowStart=row - row % sqrt;
    int colStart=col - col % sqrt;

    for (int r = rowStart; r < rowStart+sqrt; r++) {
      for (int c = colStart; c < colStart+sqrt; c++) {
        if (board[r][c]==num) {
            return false;
        }
      }
    }
    return true;
  }
}
