

public class Main {
  public static void main(String[] args) {
    Human kunal =new Human(22, "Kashif",15000,true);
    Human rahul =new Human(23, "Rahul",5000,false);

    System.out.println(kunal.age+" "+kunal.name+" "+Human.population);
    System.out.println(rahul.age+" "+rahul.name+" "+Human.population);

  }
}
