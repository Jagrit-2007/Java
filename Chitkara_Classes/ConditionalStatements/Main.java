package Chitkara_Classes.ConditionalStatements;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        boolean isStudent;

        System.out.print("Are you a student? (true or false): ");
        isStudent = sc.nextBoolean();
        sc.nextLine(); // clear buffer

        if(isStudent){
            System.out.println("You are enrolled as student!");
        }
        else{
            System.out.println("You are NOT enrolled student");
        }
        
        sc.close();
    }
}