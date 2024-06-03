// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-numsay/description/ 
// Google

import java.util.ArrayList;
import java.util.List;

public class Q2 {
  public static void main(String[] args) {
    int[] nums={4,3,2,7,8,2,3,1};
      List<Integer> ans=findDisappearedNumbers(nums);
      System.out.println(ans);
  }
  public static  List<Integer> findDisappearedNumbers(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i] - 1;
      if (nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
    // find the missing number
    List<Integer> ans=new ArrayList<>();
    for (int idx = 0; idx < nums.length; idx++) {
        if (nums[idx]!=idx+1) {
          ans.add(idx+1);
        }
        
    } 
    return ans;   
    }
   
  
    public static void swap(int[] nums, int first, int second) {
      int temp = nums[first];
      nums[first] = nums[second];
      nums[second] = temp;
    }
}
