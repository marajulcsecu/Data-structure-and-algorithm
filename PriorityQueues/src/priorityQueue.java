import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {

        Queue<String>queue= new PriorityQueue<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("D");
        queue.offer("E");
        queue.offer("C");


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }



    }
}
