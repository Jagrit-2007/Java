package Questions;
import java.util.Scanner;

public class SimpleInterest {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double principal;
        int rate, year;
        double SI, amount;

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        sc.nextLine(); // cleaning buffer

        System.out.print("Enter rate of interest(in %): ");
        rate = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter no. of years: ");
        year = sc.nextInt();
        sc.nextLine();

        SI = (principal * rate * year) / 100.0;
        amount = SI + principal;

        System.out.printf("Simple interest: %.2f\n", SI);
        System.out.printf("Total amount: %.2f\n", amount);

        sc.close();

    }
}
