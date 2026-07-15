package VariableScope;

public class Main {

    static int y = 10; // defined in main class so , it's Scope is CLASS
    public static void main(String[] args) {
        
        // variable scope : where a variable can be accessed
        //                 
        // 1. Local = a variable defined in a method has local scope   
        // 2. Class = its defined in main class like as y

        int x = 1; // this "x" has local scope because it's defined in a method
        // int x = 2; // this will giv error

        System.out.println(x);
        System.out.println(y);

        scope(); // will give 2 , because scope() method isn't aware of x = 1
    }

    static void scope(){

        int x = 2;
        System.out.println(x);
    }
}
