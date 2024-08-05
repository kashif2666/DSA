public class QueueMain {
public static void main(String[] args) throws Exception {
  CustomQueue queue=new CustomQueue(5);
  queue.insert(5);
  queue.insert(8);
  queue.insert(25);
  queue.insert(36);
  queue.insert(81);

  queue.display();

  System.out.println(queue.remove());
  queue.display();


}
}
