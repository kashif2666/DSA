package accessmodifier;

public class A {
protected  int num;
 String name;
int []arr;
    int getNum;

public int getNum(){
  return num;
}


 public void setNum(int num) {
  this.num=num;
}

public A(int num, String name){
  this.num=num;
  this.name=name;
  this.arr=new int[num];
}

}
