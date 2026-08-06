package Strings;

public class strings {
    public static void main(String[] args){

        // index starts from 0 , max index will always be 1 less than the length of string

        String name1 = "Jagrit Bansal";
        String name2;
        String name3 = "   Meoww meow    ";
        String name4 = "";

        // returns length of string
        int length = name1.length();
        System.out.println(length); // 13

        // returns character at specific index
        // .charAt(index)
        char letter = name1.charAt(0);
        System.out.println(letter); // J

        // returns first occurence of char as index
        int index = name1.indexOf("a");
        System.out.println(index); // 1

        // returns last occurence of char as index
        int lastIndex = name1.lastIndexOf("a");
        System.out.println(lastIndex); // 11

        // makes all chars to UPPERCASE
        name2 = name1.toUpperCase(); 
        System.out.println(name2); // JAGRIT BANSAL

        // makes all chars to lowercase
        name2 = name1.toLowerCase();
        System.out.println(name2); // jagrit bansal

        // trims all extra spaces
        name2 = name3.trim(); 
        System.out.println(name2); // Meoww meow

        // replaces all First chars with second chars
        name2 = name1.replace("a", "o");
        System.out.println(name2); // Jogrit Bonsol

        // checks whether string is empty or not
        // .isEmpty() returns boolean true or false
        
        if(name4.isEmpty()){
            System.out.println("Your name can't be empty"); // Your name can't be empty
        }
        else{
            System.out.printf("Hello %s\n", name4);
        }

        // checks whether string contains any character
        // .contains("char")

        if(!name1.contains(" ")){
            System.out.println("Please enter your full name!");
        }
        else{
            System.out.printf("Hello %s\n", name1); // Hello Jagrit Bansal
        }

        // checks if strings are equal 
        // string1.equals("string2");

        if(name1.equals("Jagrit Bansal")){
            System.out.println("Correct username!"); // Correct username!
        }
        else{
            System.out.println("Incorrect username");
        }

        String greetings = "HelloWorld";

        char[] charArr = greetings.toCharArray();

        for(char ch : charArr)
        {
            System.out.print(ch + " ");
        }

    }
}
