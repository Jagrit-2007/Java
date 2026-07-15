package Questions;
import java.util.Scanner;

public class BankingProgram {
    
    // defined Scanner class in class scope in case other methods might use it
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        // BANKING PROGRAM

        // DECLARING VARIABLES

        double balance = 1938.54;
        boolean isRunning = true;
        int choice = 0;

        // DISPLAY MENU

        System.out.println("***************");
        System.out.println("BANKING PROGRAM");
        System.out.println("***************");
        System.err.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***************");

        // GET AND PROCESS USER CHOICE

        // created a while loop that until the user doesn't want to exit he/she can use it
        while(isRunning){
        System.out.print("Enter your choice (1-4): ");
        choice = sc.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance = balance + deposit();
            case 3 -> balance = balance - withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
        }
        
        
        // EXIT MESSAGE
        System.out.println("Thank you, Have a nice day!");
        sc.close();
    }

    // showBalance()

    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()

    static double deposit(){

        double amount;

        System.out.print("Enter an amount to deposit: $ ");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be Negative!");
            return 0;
        }
        else{
            return amount;
        }
    }

    // withdraw()
    
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter amount to be withdrawn: $ ");
        amount = sc.nextDouble();

        if (balance < amount) {
            System.out.println("Insufficient Balance!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be Negative!");
            return 0;
        }
        else{
            return amount;
        }

    }  
}