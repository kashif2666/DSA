package abstractclass;

public abstract class Parent {

  int age;
  final int VALUE;

  public Parent(int age0) {
    this.age = age;
    VALUE = 294268;
  }

  // abstract Parent(){

  // } // cannot create

  static void hello() {
    System.out.println("Hey, from static  parent class");
  }

  void normal() {
    System.out.println("Hey, from normal parent class");
  }

  abstract void career();

  abstract void partner();

}
