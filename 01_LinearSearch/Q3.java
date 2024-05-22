// search in range
public class Q3 {
  public static void main(String[] args) {
    int[] nums = { 23, 45, 1, 2, 8, 19, -3, -11, 16, -26 };
    int target = 225;
    int ans = linearSearch(nums, target, 1, 4);
    System.err.println(ans);

  }

  // this will perform searching
  static int linearSearch(int[] arr, int target, int start, int end) {

    // this will stops if array length ends
    if (arr.length == 0) {
      return -1;
    }

    // this will run the loop to search element
    for (int index = start; index <= end; index++) {
      int element = arr[index];
      if (element == target) {
        return index;
      }
    }
    // this will run if no target in found in the array
    return -1;
  }

}
