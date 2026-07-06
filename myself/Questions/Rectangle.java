package Questions;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float l,b; // l = length , b = breadth
        double peri, area;

        System.out.print("Enter length: ");
        l = sc.nextFloat();
        sc.nextLine(); // buffer clean

        System.out.print("Enter breadth: ");
        b = sc.nextFloat();
        sc.nextLine(); // buffer clean

        peri = (2 * (l + b));
        area = (l * b);

        System.out.println("Perimeter of rectangle: " + peri + " units");
        System.out.println("Area of rectangle is: " + area + " sq. units");

        sc.close();

    }
}
