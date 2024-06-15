// find whether the no. is power of 2 or not

public class Q8 {
  public static void main(String[] args) {
    int n=0;  // Note: fix for n=0
     boolean ans=(n&(n-1))==0;
     System.out.println(ans);
}
}
