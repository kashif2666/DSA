// https://leetcode.com/problems/first-missing-positive/description/
// https://leetcode.com/problems/first-missing-positive/submissions/1276465603
// Mising positive 
// Amazon
public class Q6 {
  public static void main(String[] args) {
    int arr[] = {2,0,1 };
    int ans = firstMissingPositive(arr);
    System.out.println(ans); 
  }
  public static  int firstMissingPositive(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correct = nums[i]-1;
      if (nums[i]>0 &&nums[i] <= nums.length && nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }
    // search for the first missing number
    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != index+1) {
        return index+1;
      }
    }

    // case-2
    return nums.length+1;    
  }
  static void swap(int[] nums, int first, int second) {
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
}
