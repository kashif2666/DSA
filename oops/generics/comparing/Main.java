package generics.comparing;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
  Student kashif =new Student(2, 87.57f);
  Student irfan =new Student(7, 96.91f);
  Student sandeep =new Student(1, 82.41f);
  Student fazle =new Student(3, 77.45f);
  Student aman =new Student(6, 69.69f);
  Student shoaib =new Student(9, 85.45f);

  Student[] list ={kashif,irfan,sandeep,fazle,aman,shoaib};

  System.out.println(Arrays.toString(list));

  // Arrays.sort(list, new Comparator<Student>(){
  //   @Override
  //   public int compare(Student o1, Student o2){
  //     return  -(int) (o1.marks - o2.marks);
  //   }
  // });

  Arrays.sort(list, (Student o1, Student o2) -> -(int) (o1.marks - o2.marks));
  System.out.println(Arrays.toString(list));


  // if (kashif.compareTo(irfan)<0) {
  //   System.out.println(kashif.compareTo(irfan));
  //   System.out.println("Irafn has more marks");
  // }

}
}
