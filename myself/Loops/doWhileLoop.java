package Loops;
import java.util.Scanner;

public class doWhileLoop {

    public static void main(String[] args){

        // Do while : runs atleast one by do then checks condition

        Scanner sc = new Scanner(System.in);

        int number = 0;

        do{
            System.out.print("Enter a number between 1 and 10: ");
            number = sc.nextInt();
            sc.nextLine();
        } while(number < 1 || number > 10);

        System.out.printf("You picked: %d", number);

        sc.close();

    }
}
