package StringBuffer;

public class Main {
    
    public static void main(String[] args) {
        
        // String Buffer : mutable sequence of characters, it means its content can be changed without creating a completley new object
        // It belongs to : java.lang.StringBuffer; 
        // it doesnot require explicit import, it's also thread safe because methods are syncronzed 
        // StringBuffer is a mutable and thread-safe sequence of characters from the java.lang package.

        // Slower than string builder
        // multi-thread modificaation is best suitable , whereas StringBuilder uses single-thread modification

        // Using concat() as string class method
        String str1 = "meow"; String str2 = " meoww";
        String res = str1.concat(str2);
        System.out.println(res);

        String grettings = "Good";
        
        // Stringbuffer object
        StringBuffer stringBuffer = new StringBuffer(grettings);

        // Few StringBuffer methods

        // 1. append() : adds content at end
        stringBuffer.append(" Evening");
        System.out.println(stringBuffer);
    
        // 2. length() : returns length
        System.out.println(stringBuffer.length());

        // 3. insert(index, "value") : adds content at specific position
        stringBuffer.insert(12, " !");
        System.out.println(stringBuffer);

        // 4. replace(start, end, "value") : replaces characters from starting to ending index
        // starting index : included , ending index : NOT included
        stringBuffer.replace(12, 14, "!*");
        System.out.println(stringBuffer);

        // 5. delete(start, end) : remove characters between two indices
        stringBuffer.delete(12,14); // start index : included, end index : NOT included
        System.out.println(stringBuffer);

        // 6. deleteCharAt(index) : removed char at specific index

        // 7. reverse() : reverse the character sequence
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        // 8. charAt(index) : returns char at specific index
        System.out.println(stringBuffer.charAt(0));

        // 9. setCharAt(index, 'char')
        stringBuffer.setCharAt(0, 'g');
        stringBuffer.setCharAt(5, 'e');
        System.out.println(stringBuffer);

        // 10. capacity() : tells how many characters can be stored without expanding internal buffer

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
    }
}
