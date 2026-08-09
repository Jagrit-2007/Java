package Questions.LogicalQues;
import java.util.Scanner;

public class BasicPrograms {

    // 1. Armstrong Number (e.g., 153 = 1^3 + 5^3 + 3^3)
    public static boolean isArmstrong(int num) {
        int original = num, digits = String.valueOf(num).length(), sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    // 2. Palindrome Number (e.g., 121, 1331)
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }

    // 3. Fibonacci Series (Prints first N terms)
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 4. Prime Number Check
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 5. Square Root Without Built-in Math.sqrt() (Binary Search)
    public static double squareRoot(double num) {
        if (num < 0) return -1;
        double low = 0, high = num, precision = 0.00001;
        if (num < 1) high = 1;

        while ((high - low) > precision) {
            double mid = low + (high - low) / 2;
            if (mid * mid > num) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Check (153): " + isArmstrong(153));
        System.out.println("Palindrome Check (121): " + isPalindrome(121));
        System.out.print("Fibonacci Series (7 terms): ");
        printFibonacci(7);
        System.out.println("Prime Check (29): " + isPrime(29));
        System.out.println("Square Root (25): " + squareRoot(25));
    }
}