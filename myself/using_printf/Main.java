package using_printf;

public class Main {
    
    public static void main(String[] args){

        // printf() = is a method used to format the output
        // %[flags][width][.percision][specifier-character]
        
        // [specifier-character] is the datatype we are going to insert 
        // 1. Strings: %s || 2. Character: %c || 3. Int: %d || 4. Double: %f || 5. Boolean: %b



        String name = "JagritBansal";
        char FirstLetter = 'J';
        int age = 18;
        double height = 60.5;
        boolean isStudent =  true;

        // see the difference , between printf and println , so we no need to use "+" again and again
        System.out.printf("Hello %s\n", name); // "\n" is a newline char
        System.out.println("Hello " + name);

        System.out.printf("Your name starts with a %c\n", FirstLetter);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Student? : %b\n", isStudent);
        // multiple format specifiers
        System.out.printf("%s is %d years old\n", name, age);


        double price1 = 913.33;
        double price2 = 10648.78;
        double price3 = -647.01;

        System.out.printf("%f\n", price1); // %f by default shows 6 numbers after decimal
        System.out.printf("%.2f\n", price2); // setting percision , only 2 numbers after decimal
        System.out.printf("%.3f\n", price3);

        System.out.printf("%+.2f\n", price3); // + will shows whether the number is +ve or -ve

        // width
        // 0 = padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 18;
        int id2 = 18373;

        System.out.printf("%06d\n", id1); // 000018
        System.out.printf("%06d\n", id2); // 018373
    }
}
