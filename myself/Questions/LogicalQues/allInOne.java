package Questions.LogicalQues;

public class allInOne {

    // 1. Armstrong Number (Without Math.pow)
    public static boolean isArmstrong(int num) {
        int original = num, digits = 0, temp = num, sum = 0;
        
        // Count total digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate power sum manually
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            
            // Manual power calculation: digit^digits
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            
            sum += power;
            temp /= 10;
        }
        return sum == original;
    }

    // 2. Palindrome Number
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }

    // 3. Fibonacci Series
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

    // 4. Prime Number Check (Without Math.sqrt)
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        // Checking till i * i <= num is equivalent to i <= sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 5. Square Root (Newton-Raphson Method - Without Math.sqrt / Math.abs)
    public static double squareRoot(double num) {
        if (num < 0) return -1;
        if (num == 0) return 0;

        double x = num;
        double root = 0.5 * (x + (num / x));

        // Precision check manually without Math.abs
        double diff = root - x;
        if (diff < 0) diff = -diff;

        while (diff > 0.00001) {
            x = root;
            root = 0.5 * (x + (num / x));
            
            diff = root - x;
            if (diff < 0) diff = -diff;
        }
        return root;
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