package Chitkara_Classes.UserInput;
import java.util.Scanner; // for taking user input we always use Scanner class and we must import it

public class Main {


    public static void main(String[] args){

        String name;
        int age;
        boolean isStudent;

        Scanner userInput = new Scanner(System.in); // Scanner is a class , then userInput is the variable 
        // new alloactes new memory to Scanner class , 
        // Scanner on right hand side converts the raw data from System.in

        // NAME
        System.out.print("Enter your name: ");
        name = userInput.nextLine();
        System.out.println("Hello " + name);


        // AGE
        System.out.print("Enter your age: ");
        age = userInput.nextInt();
        System.out.println("You are " + age + " years old");
        userInput.nextLine(); // will clear buffer if any


        // isStudent
        System.out.print("Are you a student: (true or false): ");
        isStudent = userInput.nextBoolean();
        System.out.println("You are student: " + isStudent);
        userInput.nextLine(); // will clear buffer if any


        // Performing string methods

        System.out.println(name.toLowerCase()); // Converts all chars to lowercase
        System.out.println(name.toUpperCase()); // Converts all chars to UPPERCASE
        System.out.println(name.length()); // Give length of string
        System.out.println(name.isEmpty()); // Checks whether string is empty or not, returns boolean



        userInput.close(); // close the Scanner class
    }
}
