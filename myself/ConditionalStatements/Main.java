package ConditionalStatements;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        // if statements performs a block of code if its condition is true
        // positioning matters in conditional statements

        // we also added else if
        int age;
        String name;
        boolean isStudent;

        // defining class
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = inputScanner.nextLine(); // .nextLine() leaves no buffer

        System.out.print("Enter your age: ");
        age = inputScanner.nextInt(); // .nextInt() leaves "\n" in buffer

        inputScanner.nextLine(); // clearing buffer

        System.out.print("Are you a student? (true or false): ");
        isStudent = inputScanner.nextBoolean();

        inputScanner.nextLine(); // clearing buffer

        
        
        // NAME
        // to check whether string is empty we could also use (name == "")
        // built in method to check if string is empty 
        // use this string method : variable.isEmpty()

        if(name == ""){
            System.out.println("You didn't entered your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }



        // AGE

        if(age >= 65){
            System.out.println("you are an senior!");
        }
        else if(age >= 18){
            System.out.println("You're an adult");
        }
        else if(age < 0){
            System.out.println("You are not born yet");
        }
        else if(age == 0){ // while making a comparison we use "==" means equality, NOT "=" it's assignment
            System.out.println("You're just born");
        }
        else{
            System.out.println("Your a minor lmaoo :)");
        }



        // is Student?

        if(isStudent){
            System.out.println("You are Enrolled as a Student");
        }
        else{
            System.out.println("You are NOT a student");
        }

        inputScanner.close(); // closing the class



        // Nested if-else statements
        
        // if(){
        //     if(){

        //     }
        //     else if(){

        //     }
        //     else{

        //     }
        // }
        // else{

        // }
    }
    
}
