
import java.util.Scanner;

public class Q3_sumOfAll {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;

    while (true) {
      int digit = sc.nextInt();
      if (digit == 0) {
        break;
      }

      sum += digit;
    }

    System.out.println(sum);
  }
}
