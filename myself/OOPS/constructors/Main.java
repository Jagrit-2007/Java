package OOPS.constructors;
import java.util.Scanner;

// CONSTRUCTOR : A special method with name same as that of class, its for initializing objects
// we can pass arguments to a constructor and setup initial values
// USE ONLY THESE "access modifiers" keywords like {"public", "protected", "default(no modifier)", "private"}
// NEVER USE "static" , "final" , "abstract", "syncronized" NEITHER any return like "int", "boolean", "double" NOR "void"

class Student{
    
    String name; // INSTANCE VARIABLE (class level)
    int age; // INSTANCE VARIABLE (class level)

    public Student(String name, int age){ // Student is a special method called Constructor , because its name is that of class
        
        // "this" keyword refers to the constructor's instance "name" which is at class level
        this.name = name;
        this.age = age;
    }

    // there is no need to pass parameteres here because object have already been saved in heap memory 
    void display(){
        System.out.printf("Hello %s , You are %d years old !\n", this.name, this.age);
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;

        System.out.print("Enter name of first student ");
        name = scanner.nextLine();
        System.out.print("Enter age of first student: ");
        age = scanner.nextInt();
        scanner.nextLine(); // BUFFER CLEAN

        // MAKING OBJECT FOR EVERY STUDENT
        Student std1 = new Student(name, age);

        System.out.print("Enter name of second student: ");
        name = scanner.nextLine();
        System.out.print("Enter age of second student: ");
        age = scanner.nextInt();

        // MAKING OBJECT FOR EVERY STUDENT
        Student std2 = new Student(name, age);

        std1.display();
        std2.display();

        scanner.close();
    }
}
