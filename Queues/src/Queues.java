import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();


queue.offer("mango");
queue.offer("guava");
queue.offer("apple");
queue.offer("orange");


//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
