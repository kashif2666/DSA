// Product of the Digits
public class Q4 {
  public static void main(String[] args) {
    System.out.println(digitProduct(55));
  } 
  static int digitProduct(int n){
    if (n==0) {
      return 1;
    }
    return (n%10)*digitProduct(n/10);
  } 
  }
  
