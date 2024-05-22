// https://leetcode.com/problems/richest-customer-wealth/description/
//  Richest Customer Wealth
public class Q7 {
  public static void main(String[] args) {
    int accounts[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
    System.out.println(maximumWealth(accounts));

  }

  public static int maximumWealth(int[][] accounts) {
    int ans = Integer.MIN_VALUE;

    // Method-1
    // for (int person = 0; person < accounts.length; person++) {
    // int sum = 0;
    // for (int account = 0; account < accounts[person].length; account++) {
    // sum += accounts[person][account];
    // }

    // if (sum > ans) {
    // ans = sum;
    // }
    // }

    // Method-2
    for (int[] ints : accounts) {
      int sum = 0;
      for (int anInt : ints) {
        sum += anInt;
      }

      if (sum > ans) {
        ans = sum;
      }
    }
    return ans;
  }

}
