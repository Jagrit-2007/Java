package Chitkara_Classes.ClassObjects;
import java.util.Scanner;



// static is a keyword
// content in static can't access non-static content
// static can be used in variables and methods
// we can also make static block
// static block : it is a block of code defined by "static" keyword
// it executes when class loads in memory



// class Students{
//     static String college = "XYZ";

//     Students(String name){
//         System.out.println("My name is " + name);
//         System.out.println("My college name is " + college);
//     }
// }

// public class staticKeyword {
//     static{
//         System.out.println("I am static block");
//     }

//     public static void main(String [] agrs){
        
//         // Students std1 = new Students("std1");

//         // Students std2 = new Students("Std2");

//         System.out.println(Students.college);
//     }
// }



// class Students{
//     static int num1;
//     static int num2;

// }
// public class staticKeyword{

//     static{
//         System.out.println("SUM OF TWO NUMBERS");
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         Students.num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         Students.num2 = sc.nextInt();

//         System.out.println(Students.num1 + Students.num2);

//         sc.close();
        
//     }
// }



class Employee{
    String name = "";
    int id = 0, total_count = 0;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
        total_count += 1;
    }
    void display(){
        System.out.println(total_count);
    }

}
public class staticKeyword{

    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        Employee.name = "Jagrit Bansal";
        Employee.id = 231;
        Employee.totalEmployees += 1;

        System.out.println(Employee.totalEmployees);
    }
}
