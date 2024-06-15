// count no. of set bits
public class Q10 {
  public static void main(String[] args) {
    int n=255;
    System.out.println(Integer.toBinaryString(n));
    int count=0;
  while (n>0) {
      if((n&1)==1){
count++;
      }
      n=n>>1;
    }
    System.out.println(count);
  }
}
