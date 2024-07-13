package interfacesolution;

public class PowerEngine implements Engine {

  @Override
  public void start() {
    System.out.println("I start Power engine like a normal car");

  }

  @Override
  public void stop() {
    System.out.println("I stop Power engine like a normal car");
    
  }

  @Override
  public void acc() {
    
    System.out.println("I accelerate Power Engine like a normal car");

  }

}
