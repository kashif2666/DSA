// https://leetcode.com/problems/find-the-highest-altitude/description/
public class Q12_HighestPeak {
  public int largestAltitude(int[] gain) {
    int n=gain.length+1;
    
    int []arr=new int[n];

    int sum=0;

    arr[0]=0;
    for (int i = 0; i < arr.length; i++) {
      sum+=gain[i];
      arr[i+1]=sum;
    }

    int max=findMax(arr);

    return max;
  }

  public int findMax(int[] arr) {

    int max=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>max) {
        max=arr[i];
      }
    }

    return max;
  }
}
