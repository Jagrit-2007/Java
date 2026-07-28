package OOPS.constructors;
import java.util.Scanner;

// CONSTRUCTOR : A special method with name same as that of class, its for initializing objects
// we can pass arguments to a constructor and setup initial values

class Student{
    
    String name;
    int age;

    public Student(String name, int age){ // Student is a special method called Constructor
        this.name = name;
        this.age = age;
    }
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
