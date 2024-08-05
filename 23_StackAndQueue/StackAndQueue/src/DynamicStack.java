public class DynamicStack extends CustomStack {
public DynamicStack(){
  super(); // it will call customStack
}

public DynamicStack(int size){
  super(size); // it will call customStack
}

    @Override
    public boolean push(int item) {

      // this take care of it being full
      if (this.isFull()) {
        // double the array size
        int []temp=new int[data.length*2];

          // copy all the previous items in new data
          // for (int i = 0; i < data.length; i++) {
          //   temp[i]=data[i];
          // }
          // alteernative
          System.arraycopy(data, 0, temp, 0, data.length);

        data=temp;
      }

      // at this point of time we know that array is not full
      // insert item
        return super.push(item);
    }


}
