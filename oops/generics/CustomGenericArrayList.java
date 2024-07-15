
import java.util.Arrays;

public class CustomGenericArrayList<T> {
  private Object[] data;
  private static int DEFAULT_SIZE=10;
  private int size=0;


 public CustomGenericArrayList(){
  this.data=new Object[DEFAULT_SIZE];
 } 

 public void add(T num) {
  if (isFull()) {
    resize();
  }

  data[size++]=num;
 }

 private boolean isFull() {
  return size==data.length;
}

private void resize() {
  Object []temp=new Object[data.length*2];

  // copy the current items in the new Array
  for (int i = 0; i < data.length; i++) {
    temp[i]=data[i];
  }
  data=temp;
}

public T  remove() {
  T removed=(T)(data[--size]);
  return removed;
}

public T get(int index){
  return (T)data[index];
}

public int size(){
  return size;
}

public void  set(int index, T value){
   data[index]=value;
}

public String toString(){
  return "CustomArrayList{"+"data="+Arrays.toString(data)+", size="+size+'}';
}


  public static void main(String[] args) {
    // ArrayList list=new ArrayList<>();
    // CustomArrayList list=new CustomArrayList();
    // list.add(3);
    // list.add(5);
    // list.add(9);

    // for (int i = 0; i < 14; i++) {
    //   list.add(2*i);
    // }

    // System.out.println(list);

    CustomGenericArrayList<Integer> list=new CustomGenericArrayList<>();
    // list.add(45);
    // list.add(40);
    // list.add(26);
    // list.add(24);

    for (int i = 0; i < 14; i++) {
      list.add(2*i);
    }

    System.out.println(list);




 
  }

  
}
