
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/create-target-array-in-the-given-order/
public class Q9_TargetArray{
  public int[] createTargetArray(int[] nums, int[] index) {
     List<Integer> result=new ArrayList<>();

     for (int i = 0; i < nums.length; i++) {
      result.add(index[i], nums[i]);
     }

     int[] target=new int[result.size()];
     for (int i = 0; i < target.length; i++) {
      target[i]=result.get(i);
     }

     return target;
  }
}