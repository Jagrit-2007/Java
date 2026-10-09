package CC2.Queue;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
    
    public static void main(String[] args) {
        
        // Queue :  Representation of a collection designed for holding elements prior to processing. 
        // It typically follows the FIFO (First-In, First-Out) principle, 
        // meaning elements are added at the tail (end) and removed from the head (front). 
        // It behaves just like a real-world waiting line at a bank or movie theater.

        // 1. ArrayQueue  2. Priority Queue  3. LinkedList


        // offer and poll methods DONOT give exception, so try using them
        // instead of add and remove respectively...

        // Queue methods : 
        // 1. queue.add() : can give exception
        // 2. queue.offer() : same as add but DONOT give exception & returns false in that case
        // 3. queue.remove() : can give exception
        // 4. queue.poll() : same as remove but DONOT give exception, returns null in that case
        // 5. queue.element() : Examine and return first element , and can give exception
        // 6. queue.peek() : same as element BUT DONOT give exception, returns null in that case


        Queue<Integer> queue = new LinkedList<>();

        queue.add(100);
        // Added at end
        queue.add(101);
        queue.add(102);
        System.out.println(queue);

        // Removed from start
        queue.remove();
        System.out.println(queue);

        // Added at end
        queue.offer(103);
        System.out.println(queue);

        // Removed from start
        queue.poll();
        System.out.println(queue);

        // queue.peek() : returns first element and then it got printed
        System.out.println(queue.peek());
    }
}
