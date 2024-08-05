public class StackMain {
public static void main(String[] args) throws StackException {
  CustomStack stack=new DynamicStack(5);
  stack.push(24);
  stack.push(34);
  stack.push(14);
  stack.push(18);
  stack.push(29);
  stack.push(99);

  System.out.println(stack.peek());


  System.out.println(stack.pop());
  System.out.println(stack.pop());
  System.out.println(stack.pop());
  System.out.println(stack.pop());
  System.out.println(stack.pop());

}
}
