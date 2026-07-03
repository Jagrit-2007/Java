package Operators;

// Operators :
// 1. Arthemetic  2. Logical  3. Assignment  4. Relational  5. Ternary
// 6. Increment(++) & Decrement Operators(--)

public class Main {
    public static void main(String[] args){


        // *********************** Arthemetic Operators (+,-,*,/,%) **********************************
        // there is no exponential operator  : ** use,  Math.pow() which is in-built
        // Order : PEMDAS , Paranthesis , Exponent, Multi, Divi, Add , Sub

        // Declaration
        int a,b;
        int addition, subtraction, multiplication, division, remainder;
        double exponent;

        // Assignment
        a = 10; b = 5;

        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        division = a / b;
        remainder = a % b; // % is modulo operator , it gives remainder
        exponent = Math.pow(a,b);

        System.out.println("Sum is: " + addition);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Multipliction is: " + multiplication);
        System.out.println("Division is: " + division);
        System.out.println("Remainder is: " + remainder);
        System.out.println("a power b is: " + exponent);

        // *************** Relational Operators(>,<,==) *********************

        // will give result in boolean , either true or false

        String greetings, Greetings;
        int num1, num2;

        num1 = 11;
        num2 = 22;

        greetings = "hello";
        Greetings = "hello";

        // == checks equality
        System.out.println(greetings == Greetings); // true
        System.out.println(num1 == num2); // false

        int num3, num4, num5, num6;

        num3 = 1; num4 = 0; num5 = 10; num6 = 20;

        System.out.println(num3 > num4); // true
        System.out.println(num5 < num6); // true

        // ****************** Logical Operators (!, &&, ||) *******************************
        
        // ! is LOGICAL NOT , && is LOGICAL AND , || is LOGICAL OR
        
        // Priority : ! > && > || 

        // Associativity for ! is Right to Left
        // Associativity for && and || is Left to Right 

        boolean isOnline, isSale;

        isOnline = true;
        isSale = false;

        System.out.println(!isOnline); // false
        System.out.println(isOnline && isSale); // false
        System.out.println(isOnline || isSale); // true


        // ******************* Assignment Operators (+= , -=, *=, /=)************************

        // suppose its m+=n, so it means : m = m + n
        int m,n;

        m = 10; n = 5;

        System.out.println(m+=n); // 15

        // *********************** Increment & Decrement Operators) ***************************

        // post means variable ke baad ++ ya -- lagana
        // pre means variable ke phele ++ ya -- lagana

        // post increment / post decrement
        int x = 8 , y = 5;
        System.out.println(x++); // 8 will ONLY be printed ... after it value of increment is done so x is 9 afterwards
        System.out.println(x); // 9
        System.out.println(y--); // 5 
        System.out.println(y); // 4
     
        // pre increment / pre decrement
        int A = 10 , B = 5;
        System.out.println(++A); // 11
        System.out.println(A); // 11
        System.out.println(++B); // 6
        System.out.println(B); // 6

    }
}
