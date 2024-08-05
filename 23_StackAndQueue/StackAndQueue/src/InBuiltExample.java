import java.util.*;

public class InBuiltExample {
  public static void main(String[] args) {
    Stack<Integer> stack=new Stack<>();
    stack.push(24);
    stack.push(34);
    stack.push(14);
    stack.push(18);
    stack.push(29);
    stack.push(13);
    System.out.println( stack.peek());
   

    // System.out.println(stack);

    // System.out.println(stack.get(2));

    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());

    Queue queue=new LinkedList<>();

    queue.add(25);
    queue.add(28);
    queue.add(36);
    queue.add(98);

    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue);
    System.out.println(queue.remove());
    System.out.println(queue);

    Deque<Integer> deque=new ArrayDeque<>();
    deque.add(89);
    deque.addLast(87);
    System.out.println(deque.peek());


    

  }
}
