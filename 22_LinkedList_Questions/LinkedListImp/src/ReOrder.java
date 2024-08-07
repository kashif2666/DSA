// https://leetcode.com/problems/reorder-list/description/
// Google, Facebook
public class ReOrder {
   // Function to find the middle of the list using slow and fast pointers
private ListNode getMiddle(ListNode head) {
  if (head == null) return head;
  ListNode slow = head, fast = head;
  while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
  }
  return slow;
}

public ListNode reverseList(ListNode head) {
  ListNode prev = null;
  ListNode current = head;
  while (current != null) {
      ListNode nextTemp = current.next;  // Store next node
      current.next = prev;               // Reverse current node's pointer
      prev = current;                    // Move prev and current one step forward
      current = nextTemp;
  }
  return prev;  // New head of the reversed list
}
public void reorderList(ListNode head){
  if (head==null || head.next==null) {
    return;
  }

  ListNode mid=getMiddle(head);

  ListNode hs=reverseList(mid);
  ListNode hf=head;

  while (hf!=null && hs!=null) {
    ListNode temp=hf.next;
    hf.next=hs;
    hf=temp;

    temp=hs.next;
    hs.next=hf;
    hs=temp;
  }

  // next to tail to null
  if (hf!=null) {
    hf.next=null;
  }

}
}
