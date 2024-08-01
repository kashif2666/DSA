
public class RecursiveInsertion {

  private Node head;
  private Node tail;
  private int size;

  public RecursiveInsertion() {
      this.size = 0;

  }

 // Insertion using Recursion
 public void insertRec(int val, int index) {
head=insertRec(val, index, head);
  
 }

 private Node insertRec(int val,int index, Node node){
  if (index==0) {
    Node temp=new Node(val,node);
    size++;
    return temp;
  }

node.next = insertRec(val, index-1, node.next);
return node;

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
}
