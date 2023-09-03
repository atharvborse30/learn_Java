import java.util.Queue;
import java.util.PriorityQueue;

class PriorityQueueclass {
    public static void main(String[] args){
        //creating queue using the priorityqueue class
        Queue<Integer> numbers= new PriorityQueue<>();

        //offer elements to the Queue
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: "+numbers);

        //Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed element: "+accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed element: "+ removedNumber);

        System.out.println("Updated Queue: "+numbers);
        
    }
}