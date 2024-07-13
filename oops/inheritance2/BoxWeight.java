package inheritance2;

public class BoxWeight extends Box {
  double weight;

  public  BoxWeight(){
    this.weight=-7;
  }

  // // @Override // cannot be overrided 
  // static void greeting(){
  //   System.out.println("hey, I am in BoxWeight Class greeting method");
  // }

  BoxWeight (BoxWeight other){
    super(other);
    weight=other.weight;
    

  }

  BoxWeight(double side, double weight){
    super(side);
    this.weight=weight;
  }

  public BoxWeight(double l,double w, double h, double weight){
    super(l,w,h); // call the parent class constructor
    // used to initialize value in parent class
    this.weight=weight;
  }



    
}
