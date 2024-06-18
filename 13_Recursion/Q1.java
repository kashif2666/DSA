// fun: print n to 1
// fun2: print 1 to n
// fun3: Both fun & fun2


public class Q1 {
  public static void main(String[] args) {
    fun(5);
    fun2(5);
    fun3(5);
  }
  static void fun(int n){
    
    if (n==0) {
      return;
    }
    System.out.println(n);
    fun(n-1);
  }

   static void fun2(int n){
    
    if (n==0) {
      return;
    }
    fun2(n-1);
    System.out.println(n);
  }

  static void fun3(int n){
    
    if (n==0) {
      return;
    }
    System.out.println(n);
    fun3(n-1);
    System.out.println(n);


  }

 

}
