// concept of passing n-- vs --n
// n-- occur in infinity loop because it pass value first then subtract so every time n is passed without reduction
public class Q5 {
  public static void main(String[] args) {
    fun(5); 
  }
  static void fun(int n){
    if (n==0) {
      return;
    }
    System.out.println(n);
    fun(--n);
  }
  
}

