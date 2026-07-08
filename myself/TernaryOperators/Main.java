package TernaryOperators;

public class Main {
    
    public static void main(String[] args){

        // Ternary Operator  = Return 1 of 2 value if a condition is true

        // Alternative of if else statements
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 55;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        int num = 3;
        String evenOdd = (num%2 == 0) ? "Even" : "Odd";

        System.out.println(passOrFail);
        System.out.println(evenOdd);
    }
}
