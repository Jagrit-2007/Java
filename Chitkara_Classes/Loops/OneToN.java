package Chitkara_Classes.Loops;
import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = 0, sum_n = 0;
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            
            sum_n += i;
        }

        System.out.printf("SUM IS : %d", sum_n);

        scanner.close();

    }
}
