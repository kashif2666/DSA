// https://leetcode.com/problems/transpose-matrix/
public class Q17_TransposeMatrix {
  public int[][] transpose(int[][] matrix) {

    int row=matrix.length;
    int col=matrix[0].length;

    int [][] transposeMat=new int[col][row];
     for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        transposeMat[i][j]=matrix[j][i];
      }
     } 
     
     return transposeMat;
  }
}
