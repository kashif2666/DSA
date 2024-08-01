// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class RemoveDuplicates {

  private Node head;
  private Node tail;
  private int size;

  public RemoveDuplicates() {
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

public void duplicates(){
  Node node=head;

  while (node!=null && node.next!=null) {
    if (node.value==node.next.value) {
      node.next=node.next.next;
      size--;
    }else{
      node=node.next;
    }

  }
  tail = node;
  if (tail != null) {
    tail.next = null;
  }
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
    RemoveDuplicates list =new RemoveDuplicates();
    // list.insertLast(1);
    // list.insertLast(1);
    // list.insertLast(1);
    // list.insertLast(2);
    // list.insertLast(2);
    // list.insertLast(3);
    // list.insertLast(3);
    // list.insertLast(3);
    // list.insertLast(4);
    // list.insertLast(4);
    // list.insertLast(4);


    list.display();
    list.duplicates();
    list.display();




  }
}

