// https://leetcode.com/problems/richest-customer-wealth/description/
public class Q4_RichestWealth {
//   public int maximumWealth(int[][] accounts) {

//     int ans=Integer.MIN_VALUE;
// for (int person = 0; person < accounts.length; person++) {
//   int sum=0;
//   for (int account = 0; account < accounts[person].length; account++) {
//       sum+=accounts[person][account];
//   }

//   if (ans<sum) {
//     ans=sum;
//   }
// }

// return ans;
//   }

public int maximumWealth(int[][] accounts) {

  int ans=Integer.MIN_VALUE;
    for (int[] account1 : accounts) {
        int sum=0;
        for (int account = 0; account < account1.length; account++) {
            sum += account1[account];
        }
        if (ans<sum) {
            ans=sum;
        }   }

return ans;
}
}
