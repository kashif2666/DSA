// Sum of the Digits
public class Q3 {
public static void main(String[] args) {
  System.out.println(digitSum(1259874));
} 
static int digitSum(int n){
  if (n==0) {
    return 0;
  }
  return (n%10)+digitSum(n/10);
} 
}
