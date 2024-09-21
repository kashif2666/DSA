import java.util.Scanner;

public class Q1_Largest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    int largest=findLargest(a,b,c);

   

    System.err.println("Largest number is "+largest);

  }

//   public  static int findLargest(int a, int b, int c) {
//     int max=a;
//     if (max<b) {
//       max=b;
//     }

//     if (c>max) {
//       max=c;
//     }

//     return max;
//   }


public  static int findLargest(int a, int b, int c) {
int largest=Math.max(a, Math.max(b, c));

return largest;

}

}
