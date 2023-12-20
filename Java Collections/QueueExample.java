import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("P0");
        queue.offer("P1");
        queue.offer("P2");
        queue.offer("P4");
        queue.offer("P5");
        System.out.println(queue);
        System.out.println(queue.peek()); System.out.println(queue);
        System.out.println(queue.element()); System.out.println(queue);
        System.out.println(queue.poll()); System.out.println(queue);
        System.out.println(queue.remove()); System.out.println(queue);

    }
}
