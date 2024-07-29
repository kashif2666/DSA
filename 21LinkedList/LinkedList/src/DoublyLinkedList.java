public class DoublyLinkedList {
  private Node head;
  public void insertFirst(int val){
    Node node=new Node(val);
    node.next=head;
    node.prev=null;
    if (head!=null) {
      head.prev=node;
    }
    head=node;
  }

  public void insertLast(int val){
    Node node=new Node(val);
    Node last=head;
    node.next=null;

   if (head==null) {
    node.prev=null;
    head=node;
    return;
   }

   while (last.next!=null) {
      last=last.next;
    }
    last.next=node;
    node.prev=last;
   
  }

  public Node find(int value){
    Node node=head;
  while (node!=null) {
    if (node.value==value) {
        return node;
    }
    node=node.next;
  }

    return null;
 }

 public void insertAfter(int after,int val){
  Node p=find(after);
  if (p==null) {
    System.out.println("Node doesn't exist");
    return;
  }
  Node node=new Node(val);
  node.next=p.next;
  p.next=node;
  node.prev=p;
  if (node.next!=null) {
    node.next.prev=node;  
  }
 }

 public void insertBefore(int before,int val){
  Node a=find(before);
  if (a==null) {
    System.out.println("Node doesn't exist");
    return;
  }
  Node node=new Node(val);
  node.prev=a.prev;
  a.prev=node;
  node.next=a;

  if (node.prev!=null) {
    node.prev.next=node;  
  }
 }

  public void display() {
    Node node = head;
    Node last=null;
    while (node != null) {
        System.out.print(node.value + " -> ");
        last=node;
        node = node.next;
    }

    System.out.println("End");

    System.out.println("Print in Reverse");
    while (last != null) {
      System.out.print(last.value + " -> ");
      last = last.prev;
  }

  System.out.println("START");
}
private class Node{
  int value;
  Node next;
  Node prev;


  public  Node(int val){
    this.value=val;
  }

  public  Node(int val, Node next, Node prev){
    this.value=val;
    this.next=next;
    this.prev=prev;
  }
}


}
