// package UserInput;
// import java.util.Scanner; // Make sure to import it for getting user input util mean utility

// // in Java, to take user input we use "scanner" and import java.util.Scanner

// public class Main{
//     public static void main(String[] args){

//         Scanner scanner = new Scanner(System.in);
//         // System.in is Standard Input Stream & System.out is Standard Output Stream
//         // Scanner is class and the scanner is the object a instance a variable
//         //

//         // USING System.out.print() & scanner.nextLine() , .nextline() used for full name
//         System.out.print("Enter your name: "); // will take input in same line
//         // scanner.nextLine();
//         // or we can assign this value to a string variable which we'll declare , this is how we take
//         // this is how we take user input

//         String name = scanner.nextLine(); // .nextLine() READS SPACES , So for full name
//         System.out.println("Hello " + name + " !");

//         // ***************************************************************************************** //

//         // USING System.out.println() & scanner.next() with .next() it DOES NOT read after space
//         System.out.println("Enter your name: "); // will now take input in next line since we used .println
//         String firstname = scanner.next(); // does not reads after space
//         System.out.println("Hello " + firstname);
//         scanner.close(); // if we do not close it sometimes lead to unexpected behaviour

//     }
// }