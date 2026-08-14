package Chitkara_Classes.ExceptionHandling;


public class throwThrows {
    
    static void checkString(String name) throws Exception{

        if(name.length() > 15)
        {
            throw new Exception("Name can't exceed 15 letters!");
        }
        else
        {
            System.out.println("Hey " + name);
        }
    }

    public static void main(String[] args) throws Exception{
        
        String name = "Jagrit Bansal";

        checkString(name);
    }
}
