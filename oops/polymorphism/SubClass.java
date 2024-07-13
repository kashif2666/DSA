package polymorphism;
import accessmodifier.A;

public class SubClass extends A {


  public SubClass(int num, String name) {
    super(num, name);
  }

  public static void main(String[] args) {
      SubClass obj= new SubClass(45, "Kashif");
      int n=obj.num;

      System.out.println("This is num"+n);
  }

}
