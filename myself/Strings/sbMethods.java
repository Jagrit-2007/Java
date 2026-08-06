package Strings;

public class sbMethods {
    
    public static void main(String[] args) {
        
        System.out.println("STRING BUILDER METHODS");
        StringBuilder sb = new StringBuilder();

        // append(): Adds text to the end
        sb.append("Java");
        System.out.println(sb);
        sb.append(" code");
        System.out.println(sb);

        // insert() : inserts at a specific position/index
        sb.insert(0, "Learn ");
        System.out.println(sb);

        // setCharAt() : replaces character at specific position/index
        sb.setCharAt(0, 'l');
        System.out.println(sb);

        // deleletCharAt : delete character at specific position/index
        sb.deleteCharAt(0);

        sb.setCharAt(0, 'L');
        System.out.println(sb);

        // delete() : deletes substring from start to end position
        // start is inclusive , end is exclusive
        sb.delete(0,5);
        System.out.println(sb);

        // reverse() : reverse the the sequence
        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        sb.insert(0, "Learn ");
        System.out.println(sb);

        // toString() : converting back to string
        sb.toString();
        System.out.println(sb);
    }
}
