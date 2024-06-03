// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
// find all duplicates
// microsoft/ amazon

import java.util.ArrayList;
import java.util.List;

public class Q4 {
  public static void main(String[] args) {
    int nums[] = {4,3,2,7,8,2,3,1};
    List<Integer> ans=findDuplicates(nums);
    System.out.println(ans);
  }
   public static List<Integer> findDuplicates(int[] nums) {
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
          ans.add(nums[idx]);
        }
        
    } 
  
    return ans;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }

}
