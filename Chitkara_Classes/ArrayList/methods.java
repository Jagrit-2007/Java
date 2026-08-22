import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class methods{
    public static void main(String[] args) {
        // 1. Initialization
        ArrayList<String> fruits = new ArrayList<>();

        // 2. add(E element) - Add elements to the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Initial List: " + fruits);

        // 3. add(int index, E element) - Insert element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After insertion at index 1: " + fruits);

        // 4. get(int index) - Access an element
        String firstFruit = fruits.get(0);
        System.out.println("Element at index 0: " + firstFruit);

        // 5. set(int index, E element) - Modify/replace an element
        fruits.set(2, "Blackberry"); // Replaces "Banana"
        System.out.println("After replacing index 2: " + fruits);

        // 6. remove(int index) - Remove by position
        fruits.remove(3); // Removes "Mango"
        
        // 7. remove(Object o) - Remove by value
        fruits.remove("Orange");
        System.out.println("After removals: " + fruits);

        // 8. contains(Object o) - Check if an element exists
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains 'Apple'? " + hasApple);

        // 9. indexOf(Object o) - Find index of an element (-1 if not present)
        int index = fruits.indexOf("Blueberry");
        System.out.println("Index of 'Blueberry': " + index);

        // 10. size() - Get the number of elements
        System.out.println("Total size: " + fruits.size());

        // 11. isEmpty() - Check if the list is empty
        System.out.println("Is list empty? " + fruits.isEmpty());

        // 12. Iterating through the ArrayList
        System.out.print("Iterating using enhanced for-loop: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 13. Sorting using Collections utility
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 14. clear() - Remove all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);
        System.out.println("Is list empty now? " + fruits.isEmpty());
    }
}