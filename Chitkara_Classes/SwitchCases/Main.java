package Chitkara_Classes.SwitchCases;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // defining Scanner class

        System.out.println("Days corresponds to number as mentioned below: ");
        System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");

        int num;

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("Today is Sunday!");
                break;
            case 2:
                System.out.println("Today is Monday!");
                break;
            case 3:
                System.out.println("Today is Tuesday!");
                break;
            case 4:
                System.out.println("Today is Wednesday!");
                break;
            case 5:
                System.out.println("Today is Thursday!");
                break;
            case 6:
                System.out.println("Today is Friday!");
                break;
            case 7:
                System.out.println("Today is Saturday!");
                break;
            
            // default code executes if no case matches the expression
            default:
                System.out.println("Please enter a valid number !");      
        }

        sc.close();
    }
}
