
import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/description/ 
// Google

// CustomStack Implementation
public class QueueUsingStack {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStack(){
    first=new Stack<>();
    second=new Stack<>();

  }

  public void add(int item){
    first.push(item);
  }

  public int remove(int item) throws Exception{
    while (!first.isEmpty()) {
      
      second.push(first.pop());
    }

    int removed=second.pop();

    while (!second.isEmpty()) {
      first.push(second.pop());
    }

    return removed;
  }

  public int peek() throws Exception{
    while (!first.isEmpty()) {
      second.push(first.pop());
    }

    int peeked=second.peek();

    while (!second.isEmpty()) {
      first.push(second.pop());
    }

    return peeked;
  }



  public boolean isEmpty(){
    return first.isEmpty();
  }



}

// Inbuilt-Stack Implementation

// class MyQueue {
//   private Stack<Integer> stack1;
//   private Stack<Integer> stack2;

//   /** Initialize your data structure here. */
//   public MyQueue() {
//       stack1 = new Stack<>();
//       stack2 = new Stack<>();
//   }

//   /** Push element x to the back of queue. */
//   public void push(int x) {
//       stack1.push(x);
//   }

//   /** Removes the element from in front of queue and returns that element. */
//   public int pop() {
//       if (stack2.isEmpty()) {
//           while (!stack1.isEmpty()) {
//               stack2.push(stack1.pop());
//           }
//       }

//   int removed=stack2.pop();

//   while (!stack2.isEmpty()) {
//     stack1.push(stack2.pop());
//   }

//   return removed;
//   }

//   /** Get the front element. */
//   public int peek() {
//       if (stack2.isEmpty()) {
//           while (!stack1.isEmpty()) {
//               stack2.push(stack1.pop());
//           }
//       }
//       int peeked=stack2.peek();

//   while (!stack2.isEmpty()) {
//     stack1.push(stack2.pop());
//   }

//   return peeked;
//   }

//   /** Returns whether the queue is empty. */
//   public boolean empty() {
//       return stack1.isEmpty() && stack2.isEmpty();
//   }
// }
