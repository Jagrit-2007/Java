package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        
        // Strings are immutable , i.e they can't be changed
        // String Builder are MUTABLE , i.e we can make changes in it

        
        String s = "";
        for(int i = 0; i < 5; i++)
        {
            // string + int ko java string me convert kr deta h automatically
            s = s + i; // every iteration creates a new String object
        }
        System.out.println(s); // 01234

        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < 5; i++)
        {
            sb.append(i); // modifies same object
        }

        // Both, StringBuilder and String are different
        // the thing came was in StringBuilder method, so we have to convert it to String first

        String res = sb.toString(); // converts back to string
        System.out.println(res);
    }
}
