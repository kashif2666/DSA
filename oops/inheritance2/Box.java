package inheritance2;

public class Box {
   double l;
  double w;
  double h;

  static void greeting(){
    System.out.println("hey, I am in Box greeting method");
  }

  public Box() {
    this.h = -1;
    this.w = -1;
    this.l = -1;

  }

  public Box(double l, double w, double h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }

  public Box(double side) {
    this.l = side;
    this.w = side;
    this.h = side;
  }

  public Box(Box old) {
    this.h = old.h;
    this.l = old.l;
    this.w = old.w;
  }

  public void information() {
    System.out.println("Running the box");
  }
}
