package ArrayLists;
import java.util.ArrayList; // import java.util.ArrayList;
import java.util.Collections; // import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        
        // Array Lists : A resizable array that stores objects (autoboxing)
        // Arrays are fixed in size , but ArrayLists can change

        // <> is diamond operator
        // <> this deals with generics, and we defined that what type of object we are going to store i.e here its Integer


        // 1. To add an element use : add()
        // 2. To remove an element use at specific index : remove(int index)
        // 3. To set a value of an element at specific postion/index : set(index, value)
        // 4. To check size of ArrayList : size()
        // 5. To access an element at specific position/index : get(index)

        // 6. Sort arraylist by Collection framework : import java.util.Collections , use Collections.sort(arrayList)
        
        ArrayList<Integer> listInt = new ArrayList<>();

        listInt.add(100);
        listInt.add(200);
        listInt.add(300);
        listInt.add(400);
        listInt.add(500);

        System.out.println(listInt); // [100, 200, 300, 400, 500]

        listInt.add(600);
        System.out.println(listInt);
        listInt.set(5, 394);
        System.out.println(listInt);
        System.out.println(listInt.get(5));
        System.out.println(listInt.size());
        System.out.println(listInt.remove(5));

        System.out.println(listInt);

        ArrayList<Double> listDouble = new ArrayList<>();
        
        listDouble.add(10.10);
        listDouble.add(20.20);
        listDouble.add(30.30);
        listDouble.add(40.40);
        listDouble.add(50.50);

        System.out.println(listDouble); // [10.10, 20.20, 30.30, 40.40, 50.50];

        ArrayList<String> listString = new ArrayList<>();

        listString.add("Apple");
        listString.add("Banana");
        listString.add("Mango");
        listString.add("Pineapple");
        listString.add("Guava");

        System.out.println(listString); // [Apple, Banana, Mango, Pineapple, Guava]

        // Sorting arraylist in alphabetical order
        Collections.sort(listString); 
        System.out.println(listString); // [Apple, Banana, Guava, Mango, Pineapple]

    }
}
