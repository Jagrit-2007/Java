package OverloadingMethods;

public class Main {
    public static void main(String[] args) {
        
        // overloaded methods: methods that share same name BUT different parameters

        // so here arguments passed are 3 but then there are 2 methods with same name but different parameters
        // one "add" method have 2 paramaters and the other "add" method have 3 parameters
        System.out.println(add(2,3,4));
        
    }
    // this is valid in java to have multiple methods with same name BUT different parameters

    // name of method is "add" BUT parameters are 2
    static double add(int a, int b){
        return a + b;
    }
    // name of method is "add" BUT parameters are 3
    static double add(int a, int b, int c){
        return a + b + c;
    }
}
