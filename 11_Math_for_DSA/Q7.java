// find whether the no. is power of 2 or not

public class Q7 {
  public static void main(String[] args) {
    int n=0;
    int count=0;
   while (n>0) { 
    int last=n&1;
    if (last==1) {
      count++;
    }
       n=n>>1;
   }
   if (count==1) {
    System.out.println("power of 2");
   }else{
    System.out.println("Not a power of 2");
   }
   
    }
}
