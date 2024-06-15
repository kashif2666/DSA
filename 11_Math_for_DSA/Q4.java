
// Find the no. of binary digit
public class Q4 {
  public static void main(String[] args) {
  int n=10;
  int count=0;
 while (n>0) { 
     count++;
     n=n>>1;

 }
 System.out.println(count);
  }
}
