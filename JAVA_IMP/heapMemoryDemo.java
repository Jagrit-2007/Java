package JAVA_IMP;

public class heapMemoryDemo {
    
    public static void main(String[] args) {
        
        // Classes : String , arrays , objects are stored in HEAP memory
        // think heap as a big box , it have a circle as SCP + one more box for memory allocation
        
        // Strings can be created in two ways
        // 1. String literals        2. Classes

        // WAY 1. String literals
        String name1 = "hello";
        String name2 = "hello";

        // here , string is created by string literal. It's stored in Spring Constant Pool (SCP)
        // String name1 = "hello"; allocates a memory in SCP
        // any variable now, just like String name2 = "hello;
        // who is assigned "hello" will be refered to that memory address ONLY. NO new Memory allocation

        // WAY 2. Classes
        String name3 = new String("hello");
        String name4 = new String("hello");

        // here , string is created by class . It's stored directly in memory
        // String name3 = new String("hello") and String name4 = new String("hello")
        // both "hello" are created on different memory address because classes are made by new
        // So, value of name3 and name4 is equal but there addresses are different

        // Lets Check:
        // "==" checks value as well as memory address
        // ".equals() checks only value NOT memory address"

        System.out.println(name1 == name2); // true
        System.out.println(name1.equals(name2)); // true

        System.out.println(name3 == name4); // false
        System.out.println(name3.equals(name4)); // true
    }
}
