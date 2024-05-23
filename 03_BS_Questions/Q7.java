// https://leetcode.com/problems/find-in-mountain-array/description/

// Search-in-mountain-array
public class Q7 {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 7, 9, 10, 11, 8, 6, 2, 0 };
    int ans = search(arr, 6);
    System.out.println(ans);
  }

  static int search(int arr[], int target) {
    int peak = peakIndexInMountainArray(arr);
    int firstTry = orderAgnosticBS(arr, target, 0, peak);
    if (firstTry != -1) {
      return firstTry;
    }
    return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
  }

  public static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] > arr[mid + 1]) {
        // you are in decreasing part of array
        // this part may be the ans, but look at the left
        /// this is why end!= mid-1

        end = mid;

      } else {
        // you are in increasing part of array

        start = mid + 1; // bcz we know mid+1 > mid element

      }
    }

    // in the end, start== end and pointing to the largest number bcz of the 2
    // checks above
    // start and end always trying to find the max element in the above 2 checks
    // hence, when they are pointing to just one element , that is the max one bcz
    // that is what the check say.
    // more eleboartion at every point of the time for start and end, they have the
    // best possible ans till that tym and if we are saying that only one item is
    // remaining hence, bcz of above line that is best possible ans

    return start; // return both start or end bcz both are equal
  }

  static int orderAgnosticBS(int[] arr, int target, int start, int end) {

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

// LeetCode solution because of interface
// class Solution {
// public int findInMountainArray(int target, MountainArray mountainArr) {
// int peak = peakIndexInMountainArray(mountainArr);
// int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
// if (firstTry != -1) {
// return firstTry;
// }
// return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() -
// 1);
// }

// public int peakIndexInMountainArray(MountainArray mountainArr) {
// int start = 0;
// int end = mountainArr.length() - 1;

// while (start < end) {
// int mid = start + (end - start) / 2;
// if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
// end = mid;
// } else {
// start = mid + 1;
// }
// }
// return start;
// }

// public int orderAgnosticBS(MountainArray mountainArr, int target, int start,
// int end) {
// boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

// while (start <= end) {
// int mid = start + (end - start) / 2;
// int midVal = mountainArr.get(mid);

// if (midVal == target) {
// return mid;
// }

// if (isAsc) {
// if (target < midVal) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }
// } else {
// if (target > midVal) {
// end = mid - 1;
// } else {
// start = mid + 1;
// }
// }
// }
// return -1;
// }
// }
