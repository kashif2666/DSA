// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class Q14_CountOddInMatrix{
  public int oddCells(int m, int n, int[][] indices) {
     int[] rowCount=new int[m];
     int[] colCount=new int[n];  

     for (int[] index : indices) {
         int row=index[0];
         int col=index[1];

         rowCount[row]++;
         colCount[col]++;
     }

     int count=0;
     for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if ((rowCount[i]+colCount[j])%2==1) {
          count++;
        }
      }
     }

     return count;
  }
}