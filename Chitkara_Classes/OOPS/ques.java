package Chitkara_Classes.OOPS;
import java.util.Scanner;

// DO THE GIVEN QUESTIONS:

// 1. Write a class an initialise the instance variables using constructors
// 2. Write a WAP for runtime polymorphism
// 3. Create two strings differentiting between heap and SCP memory
// 4. Create an example of static keyword (variabes, methods and blocks)




// 1. 

class Car {
    // Instance variables
    String model;
    int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println(year + " " + model);
    }
}

public class ques {
    public static void main(String[] args) {
        Car myCar = new Car("BMW M2", 2023);
        myCar.display();
    }
}




// 2.






// 3.

// public class ques{

//     public static void main(String[] args) {
        
//         String s1 = new String("Java"); // created in normal heap memory 
        
//         // created in SCP  spring constant pool
//         String s2 = "Java";            
//         String s3 = "Java";

//         System.out.println(s1 == s2); // false since it's Heap vs SCP
//         System.out.println(s2 == s3); // true  since same location in heap
//     }
// }





// 4.

// public class ques{

//     static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
        
//         String name;
//         System.out.print("Enter your name: ");
//         name = scanner.nextLine();
//         System.out.println(name);
        
//         scanner.close();
//     }
// }