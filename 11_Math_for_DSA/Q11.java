// Method 2 & 3
// count no. of set bits
public class Q11 {
  public static void main(String[] args) {
    int n=9;
    System.out.println(Integer.toBinaryString(n));

    System.out.println(setBits(n));
  }
  static int setBits(int n){
int count=0;

// 2
while (n>0) {
  count++;
  n-=(n&-n);
  System.out.println(n);
}

// 3
// while (n>0) {
//   count++;
//   n=n&(n-1);
// }
return count;
  }
}
