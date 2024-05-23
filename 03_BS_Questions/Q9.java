// rotated sorted array with duplicate value
public class Q9 {
  public static void main(String[] args) {
    int[] arr = { 4, 5, 5, 5, 6, 7, 0, 1, 2 };
    int ans = search(arr, 5);
    System.out.println(ans);
  }

  static int search(int[] nums, int target) {

    int pivot = findPivot(nums);
    // if you didn't find a pivot , it means the array is not rotated
    if (pivot == -1) {
      // just do normal binary search
      return binarySearch(nums, target, 0, nums.length - 1);
    }
    // if pivot is found , you have found 2 ascending sorted array
    if (nums[pivot] == target) {
      return pivot;
    }
    if (target >= nums[0]) {
      return binarySearch(nums, target, 0, pivot - 1);
    }
    return binarySearch(nums, target, pivot + 1, nums.length - 1);

  }

  static int binarySearch(int[] arr, int target, int start, int end) {

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;

      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4 cases over here
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      if (arr[mid] <= arr[start]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }

    }
    return -1;
  }

  static int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4 cases over here
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }
      // if elements at middle, start, end are equal just skip the duplicates
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        // skip the duplicates
        // NOTE: what if these elements at start and end were pivots
        // check if start is pivot
        if (start < end && arr[start] == arr[start + 1])
          start++;
        else if (end > start && arr[end] == arr[end - 1])
          end--;
        else {
          start++;
          end--;
        }

      }
      // If the left side is sorted, so pivot should be in right
      else if (arr[start] <= arr[mid]) {
        start = mid + 1;
      }
      // If the right side is sorted, the pivot is in the left side
      else {
        end = end - 1;
      }
    }
    return -1;
  }
}
