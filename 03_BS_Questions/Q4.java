// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// find-first-and-last-position-of-element-in-sorted-array
public class Q4 {
  public static void main(String[] args) {
    int arr[] = { 5, 7, 7, 8, 8, 8, 8, 8, 8, 10 };
    int target = 8;
    int[] answer = searchRange(arr, target);
    System.out.println(answer[0] + "," + answer[1]);
  }

  public static int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };
    // check the first occurence if target first

    ans[0] = search(nums, target, true);
    if (ans[0] != -1) {
      ans[1] = search(nums, target, false);
    }

    return ans;

  }

  // this function just returns the index value of target
  public static int search(int[] nums, int target, boolean findStartIndex) {
    int ans = -1;

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      // find the middle element
      // int mid=(start+end)/2; // might be possible (start + end) exceed the java
      // range

      int mid = start + (end - start) / 2;

      if (target < nums[mid]) {
        end = mid - 1;

      } else if (target > nums[mid]) {
        start = mid + 1;
      } else {
        // potential answer found
        ans = mid;
        if (findStartIndex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }

    }

    return ans;
  }
}
