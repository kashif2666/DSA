// find the minimum element in the array

public class Q4 {
  public static void main(String[] args) {
    int[] arr = { 23, 45, 1, 2, 8, 19, -3, -11, 16, -26 };
    System.out.println(min(arr));
  }

  // assume arr.length != 0
  // return the min value from the array
  static int min(int[] arr) {
    int ans = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < ans) {
        ans = arr[i];
      }
    }
    return ans;
  }
}
