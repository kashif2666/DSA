// https://leetcode.com/problems/running-sum-of-1d-array/description/
public class Q3_SumOfArray {
  public int[] runningSum(int[] nums) {
     int sum=0;
     int n=nums.length;
     int [] arr=new int[n];
     for (int i = 0; i < nums.length; i++) {
      sum+=nums[i];
      arr[i]=sum;

     }   

     return arr;
  }
}
