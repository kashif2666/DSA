
import java.util.ArrayList;

//1- get the required value from dice
//2- get the required value from dice using ArrayList
//3- get the required value from dice having custom face
//4- get the required value from dice having custom face using ArrayList



public class Q2 {
public static void main(String[] args) {
  dice("", 4);
  diceFace("", 4, 8);

  System.out.println(diceRet("", 4));
  System.out.println(diceFaceRet("", 4, 8));

} 
static void dice(String p, int target){
  if (target==0) {
    System.out.println(p);
    return;
  }

  for (int i = 1; i <= 6 && i<=target; i++) {
      dice(p+i, target-i);
  }
} 

static ArrayList<String> diceRet(String p, int target){
  if (target==0) {
    ArrayList<String> list=new ArrayList<>();
    list.add(p);
    return list;
  }
  ArrayList<String> list=new ArrayList<>();
  for (int i = 1; i <= 6 && i<=target; i++) {
      list.addAll(diceRet(p+i, target-i));
  }
  return list;
} 

static void diceFace(String p, int target, int face){
  if (target==0) {
    System.out.println(p);
    return;
  }

  for (int i = 1; i <= face && i<=target; i++) {
      diceFace(p+i, target-i, face);
  }
} 

static ArrayList<String> diceFaceRet(String p, int target, int face){
  if (target==0) {
    ArrayList<String> list=new ArrayList<>();
    list.add(p);
    return list;
  }
  ArrayList<String> list=new ArrayList<>();
  for (int i = 1; i <= face && i<=target; i++) {
      list.addAll(diceFaceRet(p+i, target-i, face));
  }
  return list;
} 
}
