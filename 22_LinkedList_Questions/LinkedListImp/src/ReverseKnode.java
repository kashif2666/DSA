

// https://leetcode.com/problems/reverse-nodes-in-k-group/description/
// Google,Amazon, Microsoft, Facebook
// its also reversing the < k end items -> modify it accordingly
public class ReverseKnode {
  
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public ListNode reverseKGroup(ListNode head, int k) {
    if (k <= 1 || head == null) {
        return head; 
    }

    ListNode current = head;
    ListNode prev = null;

    while (true) {
        ListNode last = prev;
        ListNode newEnd = current;

        // Check if there are at least k nodes left to reverse
        ListNode temp = current;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head; // Not enough nodes to reverse, return the head as is
            }
            temp = temp.next;
        }

        // Reverse k nodes
        ListNode next = null;
        for (int i = 0; current != null && i < k; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        if (current == null) {
            break;
        }

        prev = newEnd;
    }
    return head; 
}

   
public ListNode reverseKAltGroup(ListNode head, int k) {
  if (k <= 1 || head == null) {
      return head; 
  }

  ListNode current = head;
  ListNode prev = null;

  while (current!=null) {
      ListNode last = prev;
      ListNode newEnd = current;

      // Check if there are at least k nodes left to reverse
      ListNode temp = current;
      for (int i = 0; i < k; i++) {
          if (temp == null) {
              return head; // Not enough nodes to reverse, return the head as is
          }
          temp = temp.next;
      }

      // Reverse k nodes
      ListNode next = null;
      for (int i = 0; current != null && i < k; i++) {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }

      if (last != null) {
          last.next = prev;
      } else {
          head = prev;
      }

      newEnd.next = current;
// skip the k nodes
for (int i = 0; current!=null && i <k; i++) {
  prev=current;
  current=current.next;
  
}
  }
  return head; 
}


}
