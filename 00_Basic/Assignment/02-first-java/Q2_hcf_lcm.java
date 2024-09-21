
import java.util.Scanner;


public class Q2_hcf_lcm {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n1=sc.nextInt(), n2=sc.nextInt();

  int temp1=n1, temp2=n2;

  while (temp1%temp2!=0) {
    int rem=temp1%temp2;
    temp1=temp2;
    temp2=rem;
  }

  int hcf=temp2;

  int lcm=(n1*n2)/hcf;

  System.out.println("Hcf : "+hcf);
  System.out.println("lcm : "+lcm);
}  
}
