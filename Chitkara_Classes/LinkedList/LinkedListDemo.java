import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 1. Initialization
        LinkedList<String> animals = new LinkedList<>();

        // 2. Standard List Operations
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        System.out.println("Initial LinkedList: " + animals);

        // 3. Deque / Double-Ended Operations (Fast Head & Tail Operations)
        animals.addFirst("Lion"); // Add to beginning
        animals.addLast("Tiger");  // Add to end
        System.out.println("After addFirst and addLast: " + animals);

        // Accessing First and Last Elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing First and Last Elements
        animals.removeFirst(); // Removes "Lion"
        animals.removeLast();  // Removes "Tiger"
        System.out.println("After removeFirst and removeLast: " + animals);

        // 4. Queue Operations (FIFO - First In, First Out)
        // offer() adds to tail, poll() retrieves and removes head, peek() inspects head
        animals.offer("Bear");
        System.out.println("After offer('Bear'): " + animals);
        
        String polledElement = animals.poll(); // Removes head ("Dog")
        System.out.println("Polled head element: " + polledElement);
        System.out.println("Peek head element: " + animals.peek());

        // 5. Stack Operations (LIFO - Last In, First Out)
        // push() adds to head, pop() removes from head
        animals.push("Wolf"); // Equivalent to addFirst()
        System.out.println("After push('Wolf'): " + animals);
        
        String poppedElement = animals.pop(); // Equivalent to removeFirst()
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Final LinkedList state: " + animals);

        // 6. Access & Search by Index
        System.out.println("Element at index 1: " + animals.get(1));
        System.out.println("Contains 'Cat'? " + animals.contains("Cat"));
        System.out.println("Total size: " + animals.size());
    }
}