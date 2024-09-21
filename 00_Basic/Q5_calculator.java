
import java.util.Scanner;


public class Q5_calculator {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
System.out.println("Enter the Arithematic Operator");
  
int ans=0;
  while (true) { 
    char ch=sc.next().trim().charAt(0);
    if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%') {
      if (ch=='+') {
        ans= 10+2;
      }

      if (ch=='-') {
        ans= 10-2;
      }

      if (ch=='*') {
        ans= 10*2;
      }

      if (ch=='/') {
        ans= 10/2;
      }
      if (ch=='%') {
        ans= 10%2;
      }
    }else if (ch=='x' || ch=='X') {
      break;
    }
    
    else{
      System.out.println("Invalid Operator");
    }   
    System.out.println(ans);
    
  }

 
}  
}
