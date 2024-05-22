// Linear Search
public class Q1 {
  public static void main(String[] args) {
    int[] nums = { 23, 45, 1, 2, 8, 19, -3, -11, 16, -26 };
    int target = -11;
    int ans = linearSearch(nums, target);
    System.err.println(ans);

  }

  // this will perform searching
  static int linearSearch(int[] arr, int target) {

    // this will stops if array length ends
    if (arr.length == 0) {
      return -1;
    }

    // this will run the loop to search element
    for (int index = 0; index < arr.length; index++) {
      int element = arr[index];
      if (element == target) {
        return index;
      }
    }
    // this will run if no target in found in the array
    return -1;
  }

  static int linearSearch2(int[] arr, int target) {

    // this will stops if array length ends
    if (arr.length == 0) {
      return -1;
    }

    // this will run the loop to search element
    for (int element : arr) {
      if (element == target) {
        return element;
      }
    }
    // this will run if no target in found in the array
    return -1;
  }

  // search the elemet and return true or false
  static boolean linearSearch3(int[] arr, int target) {

    // this will stops if array length ends
    if (arr.length == 0) {
      return false;
    }

    // this will run the loop to search element
    for (int element : arr) {
      if (element == target) {
        return true;
      }
    }
    // this will run if no target in found in the array
    return false;
  }
}