package Chitkara_Classes.ExceptionHandling;
import java.util.Scanner;

public class customException {
    
    static void excptionChecking(String name) throws Exception{

        if(name.isEmpty())
        {
            throw new Exception("Name can't be empty");
        }
        else
        {
            System.out.println("Hey " + name);
        }

    }
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        excptionChecking(name);

        sc.close();
    }
}
