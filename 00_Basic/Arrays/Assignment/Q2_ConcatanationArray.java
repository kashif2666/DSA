// https://leetcode.com/problems/concatenation-of-array/description/

public class Q2_ConcatanationArray {
  public static void main(String[] args) {
    
  }

  // public int[] getConcatenation(int[] nums) {
  //    int n=nums.length;
  //    int[] newArray=new int[2*n];

  //    int index=0;
     
  //  for (int item : nums) {
  //   newArray[index++]=item;
  //  }
  //  for (int item : nums) {
  //   newArray[index++]=item;
  //  }

  // return newArray;
  // }

  public int[] getConcatenation(int[] nums) {
    int n=nums.length;
    int[] newArray=new int[2*n];

    
 for (int i = 0; i < n; i++) {
  newArray[i]=nums[i];
  newArray[i+n]=nums[i];
 }

 return newArray;
 }
}
