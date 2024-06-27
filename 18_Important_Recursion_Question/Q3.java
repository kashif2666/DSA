
import java.util.ArrayList;

// Maze Problem
// 1- Count the no. of path in a maze only move right and down
// 2- Count the no. of path in a maze also include diagonal
// 3- Name all the path to reach the goal of maze only move right and down 
// 4- Name all the path to reach the goal of maze only move right and down using ArrayList
// 5- Name all the path to reach the goal of maze also include diagonal using ArrayList
// 6- Name all the path to reach the goal of maze only move right and down with obstacle





public class Q3 {
  public static void main(String[] args) {
    // System.out.println(countPath(3,3));
    // System.out.println(countPathDiagonal(3,3));
    // mazePath("", 3, 3);
    // System.out.println(mazePathRet("", 3, 3));
    // System.out.println(mazePathRetDiagonal("", 3, 3));


    boolean [][] board={
      {true,true,true},
      {true,false,true},
      {true,true,true}
    };

    mazePathRestriction("", board, 0, 0);

  
  } 
  static int countPath(int r, int c){
    if (r==1 || c==1) {
      return 1;
    }
    int down=countPath(r-1, c);
    int right=countPath(r, c-1);

    return down+right;
  }
  static int countPathDiagonal(int r, int c){
    if (r==1 || c==1) {
      return 1;
    }
    int down=countPathDiagonal(r-1, c);
    int right=countPathDiagonal(r, c-1);
    int diagonal=countPathDiagonal(r-1, c-1);

    return down+right+diagonal;
  }

  static void mazePath(String p, int r,int c){
    if (r==1 && c==1) {
      System.out.println(p);
      return;
    }

    if (r>1) {
      mazePath(p+'D', r-1, c);
    }
    if (c>1) {
      mazePath(p+'R', r, c-1);
    }
  }

  static ArrayList<String> mazePathRet(String p, int r,int c){
    if (r==1 && c==1) {
      ArrayList<String> list=new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> list=new ArrayList<>();

    if (r>1) {
    list.addAll(mazePathRet(p+'D', r-1, c));
    }
    if (c>1) {
      list.addAll(mazePathRet(p+'R', r, c-1));
    }
    return list;
  }

  static ArrayList<String> mazePathRetDiagonal(String p, int r,int c){
    if (r==1 && c==1) {
      ArrayList<String> list=new ArrayList<>();
      list.add(p);
      return list;
    }

    ArrayList<String> list=new ArrayList<>();

    if (r>1 && c>1) {
      list.addAll(mazePathRetDiagonal(p+'D', r-1, c-1));
      }

    if (r>1) {
    list.addAll(mazePathRetDiagonal(p+'V', r-1, c));
    }
    if (c>1) {
      list.addAll(mazePathRetDiagonal(p+'H', r, c-1));
    }
    return list;
  }

  static void mazePathRestriction(String p,boolean [][] maze, int r,int c){
    if (r==maze.length - 1 && c==maze[0].length - 1) {
      System.out.println(p);
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    if (r < maze.length - 1) {
      mazePathRestriction(p+'D',maze, r+1, c);
    }
    if (c < maze[0].length - 1) {
      mazePathRestriction(p+'R',maze, r, c+1);
    }
  }
}