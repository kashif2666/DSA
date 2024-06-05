// fibonacci number
public class Q4 {
  public static void main(String[] args) {
    System.out.println(fibonacci(3));
  }
  static int fibonacci(int n){
    if (n<2) {
      return n;
    }
return fibonacci(n-1)+fibonacci(n-2);
  }
}
