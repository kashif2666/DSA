// fibonacci number
public class Q1 {
  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      System.out.println(fiboformula(i));
    }
    // System.out.println(fiboformula(50));

  }

  static long  fiboformula(int n){
    return (long)((Math.pow(((1+ Math.sqrt(5)) / 2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5));


  }

}

