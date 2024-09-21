
import java.util.Scanner;


public class Q5_checkAlphabet {
  public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);

    char ch=sc.next().trim().charAt(0);

    if (ch == 'a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u') {
        System.out.println("vowel");
    }else{
      System.out.println("consonant");
    }



  }
}
