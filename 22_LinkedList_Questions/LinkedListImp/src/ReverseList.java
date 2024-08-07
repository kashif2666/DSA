// https://leetcode.com/problems/reverse-linked-list/description/

// https://leetcode.com/problems/reverse-linked-list-ii/description/
// Google, Microsoft, Facebook


// https://leetcode.com/problems/palindrome-linked-list/description/
// Google, Amazon, Microsoft, Linkdin, Apple,facebook
public class ReverseList {

    private static Node head;
    private Node tail;
    private int size;

    public ReverseList() {
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

        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

// resursion reverse 
    private void reverseList(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

// public ListNode reverseList(ListNode head) {
//   if (head == null || head.next == null) {
//       return head;
//   }
//   ListNode p = reverseList(head.next);
//   head.next.next = head;
//   head.next = null;
//   return p;
// }
// iterative reverse
    private void reverseListIterative(Node node) {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }

        head = prev;

    }

// public ListNode reverseList(ListNode head) {
//   ListNode prev = null;
//   ListNode current = head;
//   while (current != null) {
//       ListNode nextTemp = current.next;  // Store next node
//       current.next = prev;               // Reverse current node's pointer
//       prev = current;                    // Move prev and current one step forward
//       current = nextTemp;
//   }
//   return prev;  // New head of the reversed list
// }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("End");
    }
// https://leetcode.com/problems/reverse-linked-list-ii/description/

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }

        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    // https://leetcode.com/problems/palindrome-linked-list/description/

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
        ReverseList list = new ReverseList();
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);

        list.display();
        // list.reverseList(head);
        list.reverseListIterative(head);
        list.display();

    }
}
