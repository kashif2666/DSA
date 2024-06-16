// Newton-Raphson Square root method

public class Q4 {
  public static void main(String[] args) {
    System.out.println(newtonRaphson(40));
  }
  static double newtonRaphson(int n){
    double x=n;
    double root;
    while (true) { 
        root=0.5*(x+(n/x));

        if (Math.abs(root-x)<1) {
          break;
        }
        x=root;
    }
    return root;
  }
}
