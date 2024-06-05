// Question 4
// 1 
// 1 2
// 1 2 3
// 1 2 3 4

public class Q2 {
public static void main(String[] args) {
  // pattern4(4);
  pattern5(5);
} 
static  void pattern4(int n){
  for (int row = 1; row <=n; row++) {
    for (int col = 1; col <= row; col++) {
      System.out.print(col+" ");
    }
    System.out.println();
  }
}

static  void pattern5(int n){
  for (int row = 1; row <2*n; row++) {
    int totalColsInRow;
    if (row>n) {
      totalColsInRow=2 * n -row;
    }else{
      totalColsInRow=row;
    }
    for (int col = 0; col < totalColsInRow; col++) {
      System.out.print("* ");
    }
    System.out.println();
  }
}

}
