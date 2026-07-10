package Questions;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int guess = 0, attempts = 0;
        int randomNumber = rm.nextInt(1,11); // 11 is exclusive

        System.out.print("Guess the number (Between 1 & 10) : ");
        guess = sc.nextInt();
        attempts += 1;
        sc.nextLine();
        while(guess != randomNumber){
            System.out.println("You guessed wrong , try again");
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            sc.nextLine();
            attempts += 1;
        }

        System.out.printf("Congratulations on guessing the number: %d\n", randomNumber);
        System.out.printf("It took you %d attempts", attempts);
        sc.close();    
    }
}
