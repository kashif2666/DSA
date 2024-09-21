// https://leetcode.com/problems/flipping-an-image/description/
public class Q13_FlipImage {

  // method-1
  // public int[][] flipAndInvertImage(int[][] image) {

  //   for (int [] row : image) {
  //     // reverse the array
  //     for (int i = 0; i < (image[0].length +1)/2; i++) {
  //       // swap with xor
  //       int temp=row[i]^1;
  //       row[i]=row[image[0].length-i-1]^1;
  //       row[image[0].length-i-1]=temp;
  //     }    
  //   }
  //   return image;
      
  // }

  //method-2
  public int[][] flipAndInvertImage(int[][] image) {

      for (int[] image1 : image) {
          
            // reverse
            int start=0;
            int end=image1.length-1;

            while (start<end) {
              int temp=image1[start];
              image1[start]=image1[end];
              image1[end]=temp;
            start++;
            end--;
            }

            for (int i = 0; i < image1.length; i++) {
              if (image1[i]==1) {
                image1[i]=0;
              }else{
                image1[i]=1;
              }
            }
          
      }

      return image;

  }
}
