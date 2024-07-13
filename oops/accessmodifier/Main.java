package accessmodifier;

public class Main {
public static void main(String[] args) {
  A obj=new A(10,"Kashif");
  // need to new things
  // 1. access the data members
  // 2. Modify the data members
  int a=obj.getNum();
  System.out.println(a);

}
}
