// Bitwise Manipulation 
// Find even or odd

public class Q1 {
  public static void main(String[] args) {
    int a=69;
    boolean num=isOdd(a);
    if (num==true) {
      System.out.println("No. is odd");
    }else{
      System.out.println("No. is even");
    }
  }
  static boolean isOdd(int a){
    return (a&1)==1;
  }
  
}
