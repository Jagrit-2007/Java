package Questions;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = sc.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the # of years: ");
        years = sc.nextInt();

        // A = P*(1+r/n)^nt
        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("Amount after %d years is: %.2f", years, amount);
        sc.close();
    }
}
