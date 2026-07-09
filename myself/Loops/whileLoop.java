package Loops;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        
        // while loop : repeat a block of code while some condition is true
        Scanner sc = new Scanner(System.in);



        // 1. CHECKING WHETHER NAME IS VALID OR NOT

        String name = ""; // we initialized it , incase while taking input we commented it 
        // then there will be an error, Also initializing is a good practice

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        while(name.isEmpty()){
            System.out.print("Please enter a valid name: ");
            name = sc.nextLine();
        }

        System.out.printf("Hello %s!\n", name);



        // 2. ENTER Q TO EXIT

        String response = "";

        System.out.print("Hello , Please enter 'Q' to exit!: ");
        response = sc.nextLine().toUpperCase();

        while(!response.equals("Q")){
            System.out.print("Please enter 'Q' to exit!: ");
            response = sc.nextLine().toUpperCase();
        }

        System.out.println("You have quit the game!");




        // 3. AGE

        int age = 0;
        
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine(); // clean buffer if any

        while(age < 0){
            System.out.println("Age can NOT be negative!");
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            sc.nextLine(); // clean buffer if any
        }

        System.out.printf("Hey user , your entered age is %d.",age);


        sc.close();

    }
}
