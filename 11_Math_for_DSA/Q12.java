public class Q12 {
  public static void main(String[] args) {
    // range xor for a,b =xor(b) ^ xor (a-1)
    int a=0;
    int b=10;
    int ans= xor(b) ^ xor(a-1);
    System.out.println(ans);
  }
  static int xor(int n){
    if (n%4==0) {
      return n;
    }
    if (n%4==1) {
      return 1;
    }
    if (n%4==2) {
      return n+1;
    }
    return 0;

  }
}
