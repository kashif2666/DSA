
import java.util.Scanner;


public class Q4_largestNum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int largest=Integer.MIN_VALUE;

    while (true) { 
        int digit=sc.nextInt();

        if (digit==0) {
          break;
        }

        if (digit>largest) {
          largest=digit;
        }
    }

    System.out.println(largest);
  }
}
