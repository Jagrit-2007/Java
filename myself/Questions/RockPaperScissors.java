package Questions;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        
        System.out.println("=================================");
        System.out.println("  WELCOME TO ROCK PAPER SCISSORS  ");
        System.out.println("=================================");

        while (true) {
            System.out.print("\nEnter your move (rock, paper, scissors) or 'quit' to exit: ");
            String userMove = scanner.nextLine().toLowerCase().trim();

            // Exit condition
            if (userMove.equals("quit")) {
                System.out.println("\nThanks for playing! Goodbye!");
                break;
            }

            // Input Validation
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
                continue;
            }

            // Computer choice generation (0 = rock, 1 = paper, 2 = scissors)
            int computerIndex = random.nextInt(3);
            String computerMove = choices[computerIndex];

            System.out.println("Computer chose: " + computerMove);

            // Determine winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("paper") && computerMove.equals("rock")) ||
                (userMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("You WIN!");
            } else {
                System.out.println("Computer WINS!");
            }
        }

        scanner.close();
    }
}