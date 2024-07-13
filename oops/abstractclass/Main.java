package abstractclass;

public class Main {
  public static void main(String[] args) {
    Son son = new Son(30);
    son.career();
    son.normal();
    Parent daughter = new Daughter(20);
    daughter.career();

    Parent.hello();
    System.out.println();

    // Parent mom=new Parent(18); // can used
  }
}
