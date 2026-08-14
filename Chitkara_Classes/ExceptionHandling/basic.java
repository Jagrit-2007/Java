package Chitkara_Classes.ExceptionHandling;
import java.util.Scanner;

public class basic {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // What is exception ? : can be handled through code , the below code is "exception" NOT "error"
        // errors can't be handled by code

        // int a = 100;
        // int b = 0;

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // int result = a / b;

        // System.out.println(result);

        // the code which can cause exception comes in try block
        try
        {
            int a = 100;
            int b = 0;
            int result = a/b;

            System.out.println(result);
        }
        // catch block ONLY executes when there can be an Exception 
        catch(Exception e)
        {
            System.out.println("A number can't be divided by Zero");
        }
        
        // "finally" block always execute
        finally
        {
            System.out.println("Exception handled");
        }

        // ***************************************************************************************************** //

        // the block can cause error comes in "try"
        try
        {
            System.out.println(100/0);
        }
        // after finding exception what to do comes in "catch"
        catch(Exception e)
        {
            System.out.println("Can't be divided by zero");
        }
        // "finally" is block which will be executed regardless of exception occured or not
        finally
        {
            System.out.println("finally handled");
        }
    
        // ********************************************************************************************************// 


        int[] arr1 = new int[3];

        for(int i = 0; i < 3; i++)
        {
            try
            {
                arr1[i] = scanner.nextInt();
                // if we type any other data type like string it gives us exception 
                // Exception in thread "main" java.util.InputMismatchException
                // to put it in try block
            }
            catch(Exception e)
            {
                System.out.println("Please input an integer only!");
            }
        }

        for(int num : arr1)
        {
            System.out.print(num + " ");
        }


        // ***************************************************************************************************** //

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null

        // String str = null;
        // System.out.println(str.length()); 

        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(Exception e){
            System.out.println("String can't be empty, Please enter something");
        }

        // ***************************************************************************************************** //

        

        scanner.close();
    }
}