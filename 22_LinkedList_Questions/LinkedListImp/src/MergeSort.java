// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeSort {

  private Node head;
  private Node tail;
  private int size;

  public MergeSort() {
      this.size = 0;

  }

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
        tail = head;
    }

    size += 1;
}

  public void insertLast(int val) {

    if(tail==null){
        insertFirst(val);
        return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size += 1;
}

public static MergeSort merge(MergeSort first, MergeSort second){
   Node f=first.head;
   Node s=second.head;

   MergeSort ans=new MergeSort();

   while (f!=null && s!=null) {
    if (f.value<s.value) {
      ans.insertLast(f.value);
      f=f.next;
    }else{
      ans.insertLast(s.value);
      s=s.next;

    }
   }

   while (f!=null) {
    ans.insertLast(f.value);
    f=f.next;
   }

   while (s!=null) {
    ans.insertLast(s.value);
    s=s.next;
   }
return ans;
}


  public void display() {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.value + " -> ");
          temp = temp.next;
      }

      System.out.println("End");
  }

  private class Node {

      private int value;
      private Node next;

      public Node(int value) {
          this.value = value;

      }

      public Node(int value, Node next) {
          this.value = value;
          this.next = next;

      }
  }

  public static void main(String[] args) {
    MergeSort list1 =new MergeSort();
    MergeSort list2 =new MergeSort();

    list1.insertLast(1);
    list1.insertLast(3);
    list1.insertLast(5);
    list1.insertLast(8);

    list2.insertLast(1);
    list2.insertLast(7);
    list2.insertLast(10);
    list2.insertLast(12);


    MergeSort ans =MergeSort.merge(list1, list2);
    ans.display();

 


    


   




  }
}


