import java.util.*;

public class priority_queues {
    public static void main(String[] args) {
        //priority queue = A FIFO data structure that serves elements
        //                 with the highest priority first 
        //                 before elements with lower priority


        //Collections.reverseOrder() sorts the queue in descending order
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        Queue<String> grade = new PriorityQueue<>();

        grade.offer("B");
        grade.offer("C");
        grade.offer("A");
        grade.offer("F");
        grade.offer("D");

         while(!grade.isEmpty()){
            System.out.println(grade.poll());
        }



    }
    
}
