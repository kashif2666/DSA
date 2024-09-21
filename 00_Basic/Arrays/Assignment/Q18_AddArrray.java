// https://leetcode.com/problems/add-to-array-form-of-integer/description/

import java.util.ArrayList;
import java.util.List;

public class Q18_AddArrray {
  public static void main(String[] args) {
    int [] nums={1,2,0,0};
    int k=34;

   System.out.println( addToArrayForm(nums,k));
  }
    public static  List<Integer> addToArrayForm(int[] num, int k) {

      List<Integer> result=new ArrayList<>();
      long sum=0;

      for (int i = 0; i < num.length; i++) {
        sum=sum*10+num[i];
      }

      

      sum+=k;

      while (sum>0) {
        long rem=sum%10;

        result.add(0,rem);
        sum/=10;
      }
        
      return result;
    }
}
