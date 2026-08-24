package WrapperClass;

public class Main {
    
    public static void main(String[] args) {
        
        // Wrapper Class : allows primitive values (int, char, doube, boolean) to be USED as OBJECTS 
        // it allows the use of collection frameworks and static utitlity methods

        // Autoboxing technique

        Integer f = 300;
        Character g = '*';
        Double h = 84.53;

        // Unboxing : converting wrapper classes i.e those objects back to primtive data types

        int x = f; 
        System.out.println(x);

        char y = g;
        System.out.println(y);

        double z = h;
        System.out.println(z);

        // Utility methods of Wrapper classes

        // 1. Converting an integer into a string using Integer wrapper class

        String k = Integer.toString(100); // using toString() method on Integer wrapper class
        String l = Double.toString(402.42);
        String m = Character.toString('&');
        String n = Boolean.toString(false);

        String kLMN = k + l + m + n;
        System.out.println(kLMN);

        // 2. Converting "string" to "wrapper class"

        int a = Integer.parseInt("57");
        double b = Double.parseDouble("8432.42");

        // for character there is no "parseCharacter" utility method , so
        char c = "pizza".charAt(0);

        Boolean d = Boolean.parseBoolean("true");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 3. Checks if the letter isLetter , returns boolean value

        char letter1 = 'c';
        char letter2 = '4';

        System.out.println(Character.isLetter(letter1)); // 'c' is a letter so true
        System.out.println(Character.isLetter(letter2)); // '4' is NOT a letter so false

        // 4. checks is letter is uppercase or lowercase
        
        System.out.println(Character.isUpperCase(letter1)); // false
        System.out.println(Character.isLowerCase(letter1)); // true
    }
}
