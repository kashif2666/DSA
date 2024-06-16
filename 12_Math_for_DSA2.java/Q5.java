// Factorial of a number
import java.util.ArrayList;

public class Q5 {
  public static void main(String[] args) {
    // factorial(20);
    // factorial2(20);
    factorial3(20);

  }

  static void factorial(int n){
    for (int i = 1; i <= n; i++) {
        if (n%i==0) {
          System.out.print(i+" ");
        }
    }
  }
  static void factorial2(int n){
    for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n%i==0) {
          System.out.print(i+" "+n/i+ " ");
        }
    }
  }
  static void factorial3(int n){
    ArrayList<Integer> list=new ArrayList<>();
    for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n%i==0) {
          System.out.print(i+" ");
          list.add(n/i);
        }
    }
    for (int idx = list.size()-1; idx >=0; idx--) {
        System.out.print(list.get(idx)+" ");
        
    }
  }
}
