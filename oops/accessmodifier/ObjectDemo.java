package accessmodifier;

public class ObjectDemo {
int num;
float gpa;

@Override
public String toString() {
  return super.toString();
}

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public ObjectDemo(int num){
      this.num=num;
      this.gpa=gpa;
    }

    

    public ObjectDemo(int num, float gpa){
      this.num=num;
      this.gpa=gpa;
    }

    // we will go in detail in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
      ObjectDemo obj=new ObjectDemo(34);
      ObjectDemo obj2=obj;

      ObjectDemo obj3=new ObjectDemo(34,12.56f);
      ObjectDemo obj4=new ObjectDemo(34,36.66f);

      if (obj3 == obj4) {
        System.out.println("Obj 3 == obj4");
      }

      if (obj3.equals(obj4)) {
        System.out.println("Obj 3 is equal to obj4");
      }



      System.out.println(obj.hashCode());
      System.out.println(obj2.hashCode());

    }
    


}
