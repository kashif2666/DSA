// Reverse a number
public class Q6 {
  static int sum=0;
  static void reverse1(int n){
    if (n==0) {
      return;
    }
    int remainder=n%10;
    sum=sum*10+remainder;
    reverse1(n/10);
  }

  public static void main(String[] args) {
    reverse1(1);
    System.out.println(sum);
  }
}
