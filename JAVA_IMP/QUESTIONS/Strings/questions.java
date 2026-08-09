package QUESTIONS.Strings;

public class questions {
    
    public static void main(String[] args) {
        
        // REVERSE THE STRING

        String s1 = "helloWorld";
        String s2 = "";

        char[] charArray1 = s1.toCharArray();
        
        
        for(int i = charArray1.length - 1; i >=0 ; i--)
        {
            s2 += charArray1[i];
        }

        System.out.println(s2);

        // COUNT VOWELS, CONSONANTS AND SPACES IN A SENTENCE (CASE SENSITIVE)

        String s3 = "I am a student of Chitkara University";

        char[]
    }
}
