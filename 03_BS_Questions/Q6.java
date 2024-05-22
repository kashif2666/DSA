// https://leetcode.com/problems/peak-index-in-a-mountain-array/ 

// https://leetcode.com/problems/find-peak-element/

// solution of 2 questions 
// Bitonic array/mountain array: increasing and then decreasing array
// e.g., 1,3,7,9,11,8,6,2,0
public class Q6 {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 7, 9, 10, 11, 8, 6, 2, 0 };
    int ans = peakIndexInMountainArray(arr);
    System.out.println(arr[ans]);
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
}
