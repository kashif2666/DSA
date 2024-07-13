package inheritance2;

public class Main {
  public static void main(String[] args) {
    // Box box = new Box(8);
    // System.out.println(box.l + " " + box.w + " " + box.h);

    // BoxWeight box3= new BoxWeight();
    // System.out.println(box3.h+" "+box3.weight);

    // BoxWeight box4= new BoxWeight(2,3,4,8);
    // System.out.println(box4.l+" "+box4.w+" "+ box4.h+" "+box4.weight);

    // Box box5=new BoxWeight(2,3,4,5);
    // System.out.println(box5.weight); box5.weight // error because you cannot  access child class varible using parent class

    // there are many variables in both parent and child classes 
    // you are given access to variables that are in the ref type i.e, BoxWeight 
    // hence, you should have access to weight variable 
    // this also means, that the one you are  trying to access should be initialized 
    // but here, when the obj itself is of type parent class, how will you call the child class 
    // this is why getting an error

    //  BoxWeight box6= new Box(2,3,4);
    //  System.out.println(box6.weight);

    // BoxPrice box7=new BoxPrice(5,8,200);
    // System.out.println(box7.cost+" "+box7.weight+" "+box7.l+" "+box7.w+" "+box7.h);

    // Box.greeting();
    BoxWeight box10=new BoxWeight();
    box10.greeting(); // you can inherit but cannot override

  }
}
