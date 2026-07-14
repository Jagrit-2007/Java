package Methods;
import java.util.Scanner;

public class returningMethod {
    public static void main(String[] args) {

        // defining Scanner class
        Scanner sc = new Scanner(System.in);

        // initializing
        double num1 = 0, num2 = 0;
        double sqVal = 0, sqRootVal = 0;

        // Square 
        System.out.println("THIS IS FOR DOING SQUARE OF A NUMBER !");
        System.out.print("Enter the number: ");
        num1 = sc.nextDouble();

        sqVal = squareMethod(num1);
        System.out.printf("Square of %.2f is : %.2f\n", num1, sqVal);

        // Square root
        System.out.println("THIS IS FOR DOING SQUARE ROOT OF A NUMBER !");
        System.out.print("Enter the number: ");
        num2 = sc.nextDouble();

        sqRootVal = squareRootMethod(num2);
        System.out.printf("Square root of %.2f is : %.2f\n", num2, sqRootVal);

        sc.close();
        
    }   

    // RESULT 1
    static double squareMethod(double number){

        double result1;
        result1 = Math.pow(number, 2);
        return result1;

    }

    // RESULT 2
    static double squareRootMethod(double number){

        double result2;
        result2 = Math.sqrt(number); // we already defined number as double
        return result2;
    }
}
