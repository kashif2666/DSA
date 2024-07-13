package polymorphism;

import accessmodifier.A;

public class Main {
public static void main(String[] args) {
  Shapes shape=new Shapes();
  Circle circle=new Circle();
  Triangle triangle=new Triangle();
  Shapes square=new Square();

  A a =new A(10, "kashif");
  int n=a.num;
  System.out.println(n);


  shape.area();
  circle.area();
  square.area();
}
}
