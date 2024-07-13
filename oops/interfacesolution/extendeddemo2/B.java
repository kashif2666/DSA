package extendeddemo2;

public interface B  {
 public  void greet();
  default void fun(){
    System.out.println("I am in A");
  };
  }
