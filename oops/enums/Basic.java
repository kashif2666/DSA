package enums;

import enums.Basic.Week;

public class Basic {
enum Week implements A{
  Monday, Tuesday, Wednesday, Thrusday, Friday, Saturaday, Sunday;
  // these are enums constant 
  // public static final
  // since it's final you cannot create child enums
  // here, type of enum is Week

  Week(){
    System.out.println("Constructor called for "+this);
  
  }
  // this is not public or protected, only private and default
  // why? we dont want to create new Objects
  // bcz this is not enum concepts, thats why

  @Override
  public void hello() {
    System.out.println("Hey, from enum interface");
  }

  // internally, public  static final week Monday = new Week();
}

public static void main(String[] args) {
  Week week;
  week=Week.Thrusday;

  for (Week day : Week.values()) {
      System.out.println(day);
  }

  System.out.println(week);
  System.out.println(week.ordinal());

  week.hello();
  System.out.println(Week.valueOf("Tuesday"));

}
}
