// Binary Search
public class Q1 {
  public static void main(String[] args) {

    int[] arr = { -18, -7, -2, 0, 5, 9, 11, 18, 56, 68, 99, 100 };
    int target = 56;
    int answer = binarySearch(arr, target);
    System.out.println(answer);
  }

  // return the index
  // return -1 if target element is not found
  static int binarySearch(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      // find the middle element
      // int mid=(start+end)/2; // might be possible (start + end) exceed the java
      // range

      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;

      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        // answer found
        return mid;
      }

    }
    return -1;

  }
}