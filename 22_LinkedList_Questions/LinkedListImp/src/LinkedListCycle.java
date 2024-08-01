// https://leetcode.com/problems/linked-list-cycle/description/
// Amazon and Microsoft

// https://leetcode.com/problems/linked-list-cycle-ii/description/

// https://leetcode.com/problems/happy-number/
// Google

// https://leetcode.com/problems/middle-of-the-linked-list/description/
// Google

public class LinkedListCycle {

  private static Node head;
  private Node tail;
  private int size;

  public LinkedListCycle() {
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

public static  boolean hasCycle(Node head) {
  Node fast=head;
  Node slow=head; 

  while(fast!=null && fast.next!=null){
   fast=fast.next.next;
   slow=slow.next;

   if(fast==slow){
       return true;
   }

  }

  return false;

}

public static int lengthOfCycle(Node head) {
  Node fast=head;
  Node slow=head; 

  while(fast!=null && fast.next!=null){
   fast=fast.next.next;
   slow=slow.next;

   if(fast==slow){

    Node temp=slow;
    int length=0;
    do { 
        temp=temp.next;
        length++;
    } while (temp!=slow);
       return length;
   }

  }

  return 0;

}


// https://leetcode.com/problems/linked-list-cycle-ii/description
public Node detectCycle(Node head) {
  int length=0;
  Node fast=head;
  Node slow=head; 

  while(fast!=null && fast.next!=null){
   fast=fast.next.next;
   slow=slow.next;

   if(fast==slow){
       length=lengthOfCycle(slow);
       break;
   }
  }

  if(length==0){
    return null;
  }
   // find the start in the cycle
   Node f=head;
   Node s=head;

   while (length>0) {
    s=s.next;
    length--;
   }

   while (f!=s) {
    f=f.next;
    s=s.next;
   }

return s;
        
}


// https://leetcode.com/problems/happy-number/
public boolean isHappy(int n){
  int slow=n;
  int fast=n;

  do { 
      slow=findSquare(slow);
      fast=findSquare(findSquare(fast));
  } while (slow!=fast);

return slow==1;
}

private int findSquare(int num){
  int ans=0;

  while (num>0) {
    int rem=num%10;
    ans+=rem*rem;
    num/=10;
  }
  return ans;
}

// https://leetcode.com/problems/middle-of-the-linked-list/description/

public Node middleNode(Node head) {
  Node fast=head;
  Node slow=head;

  while (fast!=null && fast.next!=null) {
    fast=fast.next.next;
    slow=slow.next;
  }

  return slow;
      
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
    LinkedListCycle list =new LinkedListCycle();


        list.insertLast(20);
        list.insertLast(4);
        list.insertLast(15);
        list.insertLast(10);

        /*Create loop for testing */
        LinkedListCycle.head.next.next.next.next = LinkedListCycle.head;

      // Test hasCycle method
      boolean result = LinkedListCycle.hasCycle(head);
      System.out.println("Does the linked list have a cycle? " + result);

    int length=LinkedListCycle.lengthOfCycle(head);
    System.out.println("Length of Cycle : "+length);

    System.out.println(list.detectCycle(head));

   
    System.out.println(list.isHappy(19));
System.out.println(list.middleNode(head));



    


   




  }

 
}



