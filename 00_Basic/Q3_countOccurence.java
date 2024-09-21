
import java.util.Scanner;


public class Q3_countOccurence {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    long num=sc.nextLong();
    int target=sc.nextInt();

    int count=0;
    while (num>0) { 
        
        long rem=num%10;
        if (rem==target) {
          count++;
        }
      num/=10;
    }

    System.out.println("No. of "+target+"'s : "+count);
  }
}
