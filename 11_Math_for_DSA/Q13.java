// https://leetcode.com/problems/flipping-an-image/submissions/1289825901/ 
//  Google Question
// Flipping an image
import java.util.Arrays;

public class Q13 {
  public static void main(String[] args) {
   int [][]image= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

   System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
  }
  public static int[][] flipAndInvertImage(int[][] image) {

    for (int [] row : image) {
      // reverse the array
      for (int i = 0; i < (image[0].length +1)/2; i++) {
        // swap with xor
        int temp=row[i]^1;
        row[i]=row[image[0].length-i-1]^1;
        row[image[0].length-i-1]=temp;
      }    
    }
    return image;
      
  }

}
