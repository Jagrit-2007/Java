import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=================================");
        System.out.println("       JAVA CALCULATOR    ");
        System.out.println("=================================");

        while (keepRunning) {
            // 1. First number input
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            // 2. Operator input
            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            // 3. Second number input
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            // 4. Perform calculation based on operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Edge case: Division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                case '%':
                    if (num2 == 0) {
                        System.out.println("Error: Modulo by zero is not allowed!");
                        validOperation = false;
                    } else {
                        result = num1 % num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, /, or %.");
                    validOperation = false;
                    break;
            }

            // 5. Display result if operation was valid
            if (validOperation) {
                System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
            }

            // 6. Ask user if they want to continue
            System.out.print("\nDo you want to calculate again? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                keepRunning = false;
                System.out.println("Goodbye! Have a great day.");
            }
        }

        scanner.close();
    }
}