package Chitkara_Classes.ClassObjects;
import java.util.Scanner;


// in this class, its either "public" or nothing, NO private using
public class average {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        averageData s1 = new averageData();

        System.out.print("Enter marks in maths: ");
        s1.maths = sc.nextDouble();
   
        System.out.print("Enter marks in physics: ");
        s1.phy = sc.nextDouble();

        System.out.print("Enter marks in chemistry: ");
        s1.chem = sc.nextDouble();
        
        s1.display();

        sc.close();
    }
}
