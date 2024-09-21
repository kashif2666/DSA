
import java.util.Arrays;

public class Q3_Reverse {
  public static void main(String[] args) {
    int []arr={1,3,23,9,18,7};

    reverse(arr);

    System.out.println(Arrays.toString(arr));
  }

  public static void reverse(int[] arr) {
int start=0;
int end=arr.length-1;

while (start<end) {
  //swap
  int temp=arr[start];
  arr[start]=arr[end];
  arr[end]=temp;

  start++;
  end--;
}

  }
}
