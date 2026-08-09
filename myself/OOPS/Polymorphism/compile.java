package OOPS.Polymorphism;

//  Overloading (compiletime & static) is always Polymorphism

class Calculator{
    
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
}


public class compile {
 
    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2,3,4));
        System.out.println(calculator.add(2,3,4,5));
    }
}
