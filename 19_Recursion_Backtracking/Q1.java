// BackTracking question
import java.util.Arrays;

//1- Move all path in a maze
//2- Move all path in a maze also count the steps


public class Q1 {
  public static void main(String[] args) {
    boolean [][] board={
      {true,true,true},
      {true,true,true},
      {true,true,true}
    };

    // mazeAllPath("", board, 0, 0);
    int [][]path= new int[board.length][board[0].length];
    mazeAllPathPrint("", board, 0, 0,path,1);

  }

  static void mazeAllPath(String p,boolean [][] maze, int r,int c){
    if (r==maze.length - 1 && c==maze[0].length - 1) {
      System.out.println(p);
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    // I am considering this block in my path
    maze[r][c]=false;

    if (r < maze.length - 1) {
      mazeAllPath(p+'D',maze, r+1, c);
    }
    if (c < maze[0].length - 1) {
      mazeAllPath(p+'R',maze, r, c+1);
    }
    if (r >0) {
      mazeAllPath(p+'U',maze, r-1, c);
    }
    if (c >0) {
      mazeAllPath(p+'L',maze, r, c-1);
    }

    // this is the line where function will be over
    // so before the functions gets removed, also remove the changes that were made by the function
    maze[r][c]=true;
  }

  static void mazeAllPathPrint(String p,boolean [][] maze, int r,int c, int [][] path, int step){
    if (r==maze.length - 1 && c==maze[0].length - 1) {
      path[r][c]=step;
      for (int[] arr : path) {
          System.out.println(Arrays.toString(arr));
      }
      System.out.println(p);
      System.out.println();
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    // I am considering this block in my path
    maze[r][c]=false;
    path[r][c]=step;

    if (r < maze.length - 1) {
      mazeAllPathPrint(p+'D',maze, r+1, c, path, step+1);
    }
    if (c < maze[0].length - 1) {
      mazeAllPathPrint(p+'R',maze, r, c+1, path, step+1);
    }
    if (r >0) {
      mazeAllPathPrint(p+'U',maze, r-1, c, path, step+1);
    }
    if (c >0) {
      mazeAllPathPrint(p+'L',maze, r, c-1, path, step+1);
    }

    // this is the line where function will be over
    // so before the functions gets removed, also remove the changes that were made by the function
    maze[r][c]=true;
    path[r][c]=0;

  }
}
