
public class Q2_Max {
public static void main(String[] args) {
  int [] arr={1,9,3,55,41,36,66,4,3,7,21};
  System.out.println(max(arr));
}

public static int max(int[] arr) {

  int max=Integer.MIN_VALUE;
  for (int i = 0; i < arr.length; i++) {
      if (max<arr[i]) {
        max=arr[i];
      }
  }

  return max;
}  
}
