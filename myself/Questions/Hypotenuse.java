package Questions;
import java.util.Scanner;
public class Hypotenuse {

    // Finding hypotenuse of triangle
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a, b, hypotenuse; // a = side 1 , b = side 2
        
        System.out.print("Enter side 1: ");
        a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        b = sc.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("Hypotenuse of triangle is: " + hypotenuse + " units");

        sc.close();
    }
}
