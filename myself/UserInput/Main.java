package UserInput;
import java.util.Scanner; // Make sure to import it for getting user input util mean utility

// in Java, to take user input we use "scanner" and import java.util.Scanner
// .class file is the file which runs , it's the compiled file
public class Main{

    // this class is the blueprint , it has no physical space 
    public static void main(String[] args){

        Scanner input_scanner = new Scanner(System.in);
        // System.in is Standard Input Stream & System.out is Standard Output Stream
        // Scanner is class and the input_scanner is the variable that holds the object
        // new is a java Keyword , it commands java allocates space in computer memory 
        // Scanner (System.in) is the object being created and is paired with input source 

        // in Scanner(System.in) , System.in gives raw data , Scanner translates it and then value is stored
        // then whats need of new? if these are doing ther work
        // classes in java doesnot exist in memory , so "new" makes a space allocate to it
    

        

        // USING System.out.print() & scanner.nextLine() , .nextline() used for full name
        System.out.print("Enter your name: "); // will take input in same line
        // scanner.nextLine();
        // or we can assign this value to a string variable which we'll declare , this is how we take
        // this is how we take user input

        String name = input_scanner.nextLine(); // .nextLine() READS SPACES , So for full name
        System.out.println("Hello " + name + " !");





        // USING System.out.println() & scanner.next() with .next() it DOES NOT read after space
        System.out.println("Enter your name: "); // move to next line since we used .println
        String firstname = input_scanner.next(); // does not reads after space
        System.out.println("Hello " + firstname + ". This is your first name!");

        input_scanner.nextLine(); // clears input buffer , if in previous input user type something 
        // with space to there's left in buffer , so clear it by this but donot pass any argument

        // scanner.close(); // if we do not close it sometimes lead to unexpected behaviour

        // ******************************************************************************************

        // to input a integer use .nextInt() , to input a double/float use .nextDouble()
        // to input a boolean use .nextBoolean()





        int age;
        System.out.print("Enter your age: "); // will take input in same line
        age = input_scanner.nextInt(); 
        System.out.println("You are " + age + " years  old");

        input_scanner.nextLine(); // clear buffer , it leaves "\n" in buffer

        
        
        
        // here is an illustration of how to take boolean as input
        System.out.println("Are you a student? (true or false) ");
        boolean isStudent = input_scanner.nextBoolean();

        if (isStudent){
            System.out.println("You are enrolled as student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }
         
        input_scanner.nextLine(); // clear buffer

        input_scanner.close();

    }
}