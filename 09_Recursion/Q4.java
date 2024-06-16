// fibonacci number
public class Q4 {
  public static void main(String[] args) {
    System.out.println(fibonacci(4));
 // doesn't work for long number

  }


  static int fibonacci(int n){
    if (n<2) {
      return n;
    }
return fibonacci(n-1)+fibonacci(n-2);
  }
}
