package StartingWithJava;

// 8 datatypes in java
// byte
// boolean = 1 bit
// int = 4 bytes
// float = 4 bytes
// double = 8 bytes
// long = 8 bytes
// short = 2 bytes
// char = 2 bytes

public class Main {

    // public class Main is the outer shell , everything in java lives inside a class
    // here Main is file name and one should always use file name as Main
    public static void main(String[] args){

        // this public static void main(String[] args) is the main method
        // it is the absolute starting point (entry point) of java 
        // when we run the JVM (java virtual machine) looks specifically for this line of code 
        // (String[] args) is the parameter called arguments , it allows program to accept a list(an array)
        // of text string from command line, even we dont use it , java requires it to be there


        System.out.print("I like pizza\n");
        System.out.println("Hello world");
        System.out.println("println makes itself to a newline");
        System.out.print("hello");

        // writing sout and hit tab gives System.out.print() , so you dont have to type it

        // THIS IS A COMMENT AND DOES NOT AFFECT THE CODE   

        /*

        This is a Multiline Comment

        */

    }
}