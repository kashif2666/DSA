
// https://leetcode.com/problems/palindrome-linked-list/description/
// Google, Amazon, Microsoft, Linkdin, Apple,facebook
public class Palindrome {
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

public boolean isPalindrome(ListNode head){
  ListNode mid=getMiddle(head);
  ListNode headSecond=reverseList(mid);
  ListNode rereverseHead=headSecond;

  // compare both halves
  while (head!=null && headSecond!=null) {
    if (head.val !=headSecond.val) {
      break;  
    }

    head=head.next;
    headSecond=headSecond.next;

  }
  reverseList(rereverseHead);

  return head==null || headSecond==null;
}



  
}
