import java.util.Scanner;

// CONSTRUCTORS : Special methods whose name is as of class
//                Constructors DONOT have any return type NOT even void
//                Automatically call itself
//                Can have access modifier like "private" or "public"



// DEFAULT CONSTRUCTOR

// class Student{
//     String name;
//     int age;
 
//     // Constructor
//     Student(){
//         name = "Jagrit";
//         age = 18;
//     }
    
//     void display() {
//         System.out.printf("Name: %s\n", name);
//         System.out.printf("Age: %s\n", age);
//     }
// }

// public class Constructors{
//     public static void main(String[] args) {
        
//         Student std = new Student();

//         std.display();
//     }
// } 




// PARAMTER CONSTRUCTOR

class Student{

    String name;
    int age;

    // Constructor
    Student(String name, int age){
        this.name = name; // this.name : Class instance variable , name : parameter
        this.age = age; // this.age : Class instance variable , age : parameter
    }
    
    // another method
    void display(){
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
    }
}

public class Constructors{
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        // Constructer object
        Student std1 = new Student(name, age);

        
        std1.display(name, age);

        scanner.close();
    }
}