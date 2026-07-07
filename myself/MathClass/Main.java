package MathClass;

public class Main {
    public static void main(String[] args){

        // for value of pi : Math.PI , value of e : Math.E
        System.out.println("Value of pi using math class: " + Math.PI);
        System.out.println("Value of e: " + Math.E);

        // exponent of "a" to power "b" by : Math.pow(a,b) 
        double result1 = Math.pow(2,5);
        System.out.println(result1); // 32.0

        // absolute , distance from zero by : Math.abs(num)
        double result2 = Math.abs(-5);
        System.out.println(result2); // 5.0

        // square root by: Math.sqrt(num) 
        double sqRoot = Math.sqrt(49);
        System.out.println(sqRoot); // 7.0 

        // round a number to its nearest integer: Math.round(num);
        double num1 = Math.round(3.49); // 3.0
        double num2 = Math.round(3.5); // 4.0
        double num3 = Math.round(-7.49); // 7.0
        double num4 = Math.round(-7.5); // 7.0

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        // ceil up a number : Math.ceil(num)
        double num5 = Math.ceil(3.13); // 4.0
        double num6 = Math.ceil(-3.14); // -3.0

        System.out.println(num5);
        System.out.println(num6);

        // floor down a number : Math.floor(num)
        double num7 = Math.floor(3.99); // 3.0
        double num8 = Math.floor(-3.1); // -4.0

        System.out.println(num7);
        System.out.println(num8);

        // Max & Min b/w two value
        int maxValue = Math.max(10, 20); // 20
        int minvalue = Math.min(1, 2); // 1

        System.out.println(maxValue);
        System.out.println(minvalue);

    }
}
