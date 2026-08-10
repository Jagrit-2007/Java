package Chitkara_Classes.ExceptionHandling;

public class basic {
    
    public static void main(String[] args) {
        
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
    
    }
}
