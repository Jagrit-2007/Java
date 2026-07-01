package Variables; // package is like a folder 
// it tells compiler that this file belongs to Variables folder

// In JAVA , ABSOLUTELY EVERY SINGLE LINE OF EXECUTING CODE , EVERY VARIABLE , EVERY FUNCTION
// MUST LIVE INSIDE A CLASS (Master Blueprint)

public class Main{
    // public means it can be accessible & can be used by any other part of program
    // class is keyword to declare that we are building a new code blueprint
    // Main is the custom name given to this blueprint .. It's name MUST match the file name Exactly
    public static void main(String[] args){

        // variable : a container for a value 

        // Primitive : simple value stored directly in memory (stack), 
        // ex : int, double, char, boolean

        // Reference : memory address (stack) that points to heap
        // ex : string, array, object


        // Steps to create variables:
        // 1. declaration     2. Assignment


        int age = 30;
        int year = 2026;
        int quantity = 1;

        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        // a float datatype can store int values , like 5 , it converts it to 5.0 automatically
        double price = 19.99;
        double gpa = 9.8;
        double temperature = 34.3;

        System.out.println(price);
        System.out.println(gpa);
        System.out.println(temperature);

        // a int datatype cannot store float/decimal values , it gives error
        // int pricee = 1.23; // error since a int cannot store a float value

        char grade = 'A'; // characters are enclosed in single quotes
        char symbol = '@';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);


        boolean isStudent = true;
        boolean isRaining = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(isRaining);
        System.out.println(isOnline);

        if(isOnline){
            System.out.println("You are online");
        }
        else{
            System.out.println("You are NOT Online");
        }


        String name = "Jagrit Bansal"; // we enclode string with double quotes
        System.out.println("Hello " + name);

    
        System.out.println("Hello " + name + " ! " + "Your age is : "+ age + ".");
    }
}