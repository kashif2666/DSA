// Find the Rotation Count in Rotated Sorted array
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class Q10 {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 4, 5, 6, 7, 8 };
    System.out.println(countRotation(arr));
  }

  private static int countRotation(int[] arr) {
    int pivot = findPivotWithDuplicates(arr);
    return pivot + 1;
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
