package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Exception : an event that interrupts the normal flow of a program
        // i.e dividing by zero, file not found, mismatch input type
        // surround any dangerous code with try{} block
        // try{} , catch(){} , finally{}

        // Exception can be handled with code, BUT ERRORS CAN'T BE HANDLED WITH CODE


        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // System.out.println(1/0);

        // Exception in thread "main" java.util.InputMismatchException
        // int num = scanner.nextInt(); // give input as String
        // System.out.println(num);

        // when working with InputMismatchException , import java.util.InputMismatchException;

        try{
            System.out.println(1 / 0);
        }
        // Exception covers all exception in it
        catch(Exception e){
            // exception name is "e"
            System.out.println("A number can't be divided by zero!");
        }

        int num = 0;
        try{
            num = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a valid number");
            scanner.nextLine(); // buffer clean
        }
        // finally blocks always executes
        finally{
            System.out.println("number is: " + num);
        }


        // A try block can have multiple catch blocks
        int res = 0;
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            res = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Number can't be divided by zero!");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a valid number");
        }
        finally{
            System.out.println("Division: " + res);
        }

        scanner.close();
    }
}