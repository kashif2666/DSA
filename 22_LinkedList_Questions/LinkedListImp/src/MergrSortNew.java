// https://leetcode.com/problems/sort-list/description/



public class MergrSortNew {
  public ListNode sortList(ListNode head) {
    // Base case: if the list is empty or has only one element
    if (head == null || head.next == null) {
        return head;
    }

    // Step 1: Split the list into two halves
    ListNode mid = getMiddle(head);
    ListNode left = head;
    ListNode right = mid.next;
    mid.next = null;

    // Step 2: Recursively sort both halves
    left = sortList(left);
    right = sortList(right);

    // Step 3: Merge the two sorted halves
    return merge(left, right);
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

// Function to merge two sorted lists
private ListNode merge(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }
    if (l1 != null) {
        current.next = l1;
    } else {
        current.next = l2;
    }
    return dummy.next;
} 
}
