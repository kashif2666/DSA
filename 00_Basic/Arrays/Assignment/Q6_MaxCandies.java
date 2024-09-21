// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class Q6_MaxCandies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max=findMax(candies); 

       List <Boolean> result =new ArrayList<>();

       for (int i = 0; i < candies.length; i++) {
        if (candies[i]+extraCandies>=max) {
          result.add(true);
        }else{
          result.add(false);
        }
       }

       return result;
    }

    public int findMax(int[] candies) {

      int max=Integer.MIN_VALUE;
      for (int i = 0; i < candies.length; i++) {
        if (candies[i]>max) {
          max=candies[i];
        }
      }

      return max;
    }
}