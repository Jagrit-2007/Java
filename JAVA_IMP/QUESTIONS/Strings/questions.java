package QUESTIONS.Strings;
import java.util.Arrays;

public class questions {
    
    public static void main(String[] args) {
        
        // REVERSE THE STRING : By String Builder

        String s1 = "helloWorld";
        StringBuilder sb1  =  new StringBuilder();

        char[] charArray1 = s1.toCharArray();
        
        for(int i = charArray1.length - 1; i >=0 ; i--)
        {
            // String builder method
            sb1.append(charArray1[i]);
        }

        System.out.println(sb1.toString()); 







        // COUNT VOWELS, CONSONANTS AND SPACES IN A SENTENCE (CASE SENSITIVE)

        String s2 = "I am a student of Chitkara University";
        
        int vowelCount = 0;
        int consCount = 0;
        int spaceCount = 0;

        // converting s2 in array
        char[] charArray2 = s2.toCharArray();

        for(char ch : charArray2)
        {
            // if spaces
            if(ch == ' ')
            {
                spaceCount++;
            }
            // checking if its "character" ONLY and not any other punctuation
            else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            {
                // if vowels
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    vowelCount++;
                }
                // rest are consonants
                else
                {
                    consCount++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consCount);
        System.out.println("Spaces: " + spaceCount);








        // Checking letter frequency // string compression

        String s3 = "aabbbbccccdddddeeeaaeeeeeffgg";
        
        int len = s3.length();
        // since letter is already present count begins from 1
        int count = 1;

        StringBuilder sb3 = new StringBuilder();
        
        for(int i = 0; i < len ; i++)
        {
            // here if (i == len-1) is not set then, it will cause StringIndexOutOfBoundsException
            // because at last iteration i will be at it's max, i+1 is not possible so it will work for only len-1 index
            if((i == len -1) || s3.charAt(i) != s3.charAt(i+1))
            {
                sb3.append(s3.charAt(i));
                sb3.append(count);
                count = 1; // sets count to 1 , if this block gets excecuted (counting of next letter would start)
            }
            else
            {
                count++;
            }
        }

        System.out.println((sb3.toString()));







        // Remove duplicate characters
        

        String s4 = "hellooo bro";

        StringBuilder sb4 = new StringBuilder(); 

        for(int i = 0; i < s4.length(); i++)
        {
            char ch = s4.charAt(i);
            
            // here we are checking if the string builder we converting to string have the character or not
            // -1 represent the string doesnt have so, it will append, but if's having the char it will move to next index to check
            // we converted sb4 to string because 'ch' is a character and string can take character only to find index
            // but string builder takes in form of string

            // Alternative : sb4.indexOf(String.valueOf(ch))
            // using String method "valueOf()" to make it convert to string

            if(sb4.toString().indexOf(ch) == -1)
            {
                sb4.append(ch);
            }

        }
        System.out.println(sb4.toString());









        // Convert lowercase to uppercase and viceversa
        
        // Method 1
        String s5 = "HelloWorld HelloWorld";
        
        StringBuilder sb5 = new StringBuilder();

        for(int i = 0; i < s5.length(); i++)
        {
            char ch = s5.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                sb5.append(String.valueOf(ch).toUpperCase());
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                sb5.append(String.valueOf(ch).toLowerCase());
            }
            else
            {
                sb5.append(ch);
            }
        }
        
        System.out.println(sb5.toString());

        // Method 2

        StringBuilder sb0 = new StringBuilder();

        for(int i = 0; i < s5.length(); i++)
        {
            char ch = s5.charAt(i);

            if(Character.isLowerCase(ch))
            {
                sb0.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch))
            {
                sb0.append(Character.toLowerCase(ch));
            }
            else
            {
                sb0.append(ch);
            }
        }

        System.out.println(sb0.toString());







        // Anargam : two phrarses / words with same characters and same frequncies of characters , means there length is also same
        // steps to solve : covert string toCharArray(), then use Array.sort() to sort it.. then use Arrays.equals(obj1, obj2) to check

        String s6 = "learn java";
        String s7 = "avaj nreal";

        char[] arrS6 = s6.toCharArray(); // creating array
        char[] arrS7 = s7.toCharArray();
        
        // import: java.util.Arrays
        Arrays.sort(arrS6); // sort it
        Arrays.sort(arrS7);

        // check if they are equal or not
        boolean result = Arrays.equals(arrS6, arrS7);
        if(result)
        {
            System.out.println("Anargam");
        }        
        else
        {
            System.out.println("Not anargam");
        }
        







        // Palindrome

        String s8 = "wiiwiiw";

        // Method 1
        StringBuilder sb8 = new StringBuilder(s8);
        String revS8 = sb8.reverse().toString();

        if(s8.equals(revS8))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }

        // Method 2
        String s9 = "wohooo broo";

        StringBuilder sb9 = new StringBuilder();

        char[] charArr9 = s9.toCharArray();

        for(int i = charArr9.length - 1; i >= 0; i--)
        {
            sb9.append(charArr9[i]);
        }
        String revString = sb9.toString();

        if(s9.equals(revString))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }

    }
}