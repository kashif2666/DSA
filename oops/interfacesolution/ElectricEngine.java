package interfacesolution;

public class ElectricEngine implements Engine {
  @Override
  public void start() {
    System.out.println("I start Electric engine like a normal car");

  }

  @Override
  public void stop() {
    System.out.println("I stop Electric engine like a normal car");
    
  }

  @Override
  public void acc() {
    
    System.out.println("I accelerate Electric Engine like a normal car");

  }
}
