import java.util.Queue;
import java.util.LinkedList;

public class queues {
    public static void main(String[] args) {
        // Queue = FIFO data structure. First-In First-out
        //         A collection designed for holding elements prior to processsing
        //         Linear data structure
        //         add = enqueue, offer()
        //         remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Bob");
        queue.offer("Bill");
        queue.offer("Ed");
        queue.offer("Eddy");

        //returns head of the queue
        System.out.println(queue.peek());

        //removes head of queue
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.contains("Ed"));


    }
}
