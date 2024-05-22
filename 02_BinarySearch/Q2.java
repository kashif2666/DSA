// Order Agonistic Binary Search
public class Q2 {
  public static void main(String[] args) {
    int[] arr = { -18, -7, -2, 0, 5, 6, 9, 11, 18, 56, 68, 99, 100 };
    // int[] arr = { 99, 87, 62, 56, 44, 36, 28, 14, 6, -3, -44 };

    int target = 6;
    int answer = orderAgnosticBS(arr, target);
    System.out.println(answer);
  }

  static int orderAgnosticBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      // find the middle element
      // int mid=(start+end)/2; // might be possible (start + end) exceed the java
      // range

      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;

        } else {
          start = mid + 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;

        } else {
          start = mid + 1;
        }
      }

    }
    return -1;

  }
}
