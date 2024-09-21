// https://leetcode.com/problems/shuffle-the-array/description/
public class Q5_ShuffleArray {

  // method-1
  // public int[] shuffle(int[] nums, int n) {
  // int []arr=new int[2*n];

  // for (int i = 0; i < n; i++) {
  // arr[2*i]=nums[i];
  // arr[2*i+1]=nums[i+n];
  // }

  // return arr;
  // }

  // method-2

  public int[] shuffle(int[] nums, int n) {
    int length = 2 * n;
    int[] arr = new int[length];
    int index = 0;

    for (int i = 0; i < length; i = i + 2) {
      arr[i] = nums[index];
      arr[i + 1] = nums[index + n];

      index++;
    }

    return arr;
  }
}
