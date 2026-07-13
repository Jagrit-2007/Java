package Chitkara_Classes.ClassObjects;
import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Carinfo car1 = new Carinfo();

        System.out.print("which car do you own: ");
        car1.carName = sc.nextLine();
        
        System.out.print("please specify the model: ");
        car1.model = sc.nextLine();

        System.out.print("it costs: ");
        car1.price = sc.nextDouble();
        sc.nextLine();

        System.out.print("which number plate would you like to chooose? : ");
        car1.numberPlate = sc.nextLine();

        car1.display();

        sc.close();
    }
}
