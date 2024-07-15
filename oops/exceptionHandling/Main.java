package exceptionHandling;

public class Main {
public static void main(String[] args) {
  int a=5;
  int b=0;

  try {
  //   //mimicing an exception
  //  throw new Exception("Fun exception");

  String name="Kashif";
  if (name.equals("Kashif")) {
    throw new MyException("name is kashif");
  }

  }catch (MyException | ArithmeticException e) {
    System.out.println(e.getMessage());

  }catch (Exception e) {
    System.out.println("Normal Exception");

  }
  finally{
    System.out.println("This will always be executed");
  }
 
}

     static int  divide(int a, int b) throws ArithmeticException {
      if (b==0) {
      
        throw new ArithmeticException("Please donot divide by 0");  
      }

      return a/b;
    }
}
