
public class Q6_Leap {
public static void main(String[] args) {
 
  System.out.println(checkLeapYear(2004));
  
}

public  static boolean  checkLeapYear(int year) {

    return year%4==0 || year%400==0;
}  
}
