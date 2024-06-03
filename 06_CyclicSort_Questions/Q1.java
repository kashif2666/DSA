// https://leetcode.com/problems/missing-number/description/ 
// Amazon Question
public class Q1 {
  public static void main(String[] args) {
    int arr[] = { 4, 0, 2, 1 };
    int ans = missing(arr);
    System.out.println(ans);
  }

  static int missing(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i] < arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    // search for the first missing number
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] != index) {
        return index;
      }
    }

    // case-2
    return arr.length;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
