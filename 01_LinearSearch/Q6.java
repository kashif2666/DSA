// Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class Q6 {

  public static void main(String[] args) {
    int[] nums = { 12, 345, 2, 6, 7896 };
    System.out.println(findNumber(nums));
    System.out.println(digits2(-2265492));

  }

  static int findNumber(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (even(num)) {
        count++;
      }
    }
    return count;
  }

  static boolean even(int num) {
    int numberOfDigits = digits(num);
    if (numberOfDigits % 2 == 0) {
      return true;
    }
    return false;
  }

  static int digits2(int num) {

    if (num < 0) {
      num = num * -1;
    }
    return (int) (Math.log10(num) + 1);
  }

  static int digits(int num) {

    if (num < 0) {
      num = num * -1;
    }
    if (num == 0) {
      return 1;
    }

    int count = 0;
    while (num > 0) {
      count++;
      num = num / 10;
    }
    return count;

  }

}
