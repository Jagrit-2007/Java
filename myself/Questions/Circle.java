package Questions;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float radius;
        double circumfrence, area;

        System.out.print("Enter radius: ");
        radius = sc.nextFloat();

        circumfrence = 2 * 3.14 * radius;
        area = 3.14 * Math.pow(radius,2); // to use Math functions use Math. 

        System.out.println("Circumfrence of circle is: " + circumfrence + " units.");
        System.out.println("Area of circle is: " + area + " sq. units");

        sc.close();
    }
}
