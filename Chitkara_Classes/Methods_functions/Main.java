package Chitkara_Classes.Methods_functions;
import java.util.Scanner;

public class Main {


    // Defining methods , in Java methods are functions
    int sum(int a, int b){
        int c = a + b;
        System.out.println(c);
        return c;
        }
    int sub(int a, int b){
        int c = a - b;
        System.out.println(c);
        return c;
    }    
    int mult(int a, int b){
        int c = a * b;
        System.out.println(c);
        return c;
    }
    int div(int a, int b){
        int c = a / b;
        System.out.println(c);
        return c;
    }
    int remainder(int a, int b){
        int c = a % b;
        System.out.println(c);
        return c;
    }
    // for even odd
    boolean evenOdd(int a){
        if(a%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Main test = new Main();

        test.sum(2,3);
        test.sub(5,2);
        test.mult(4,5);
        test.div(10,5);
        test.remainder(5,3);

        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        sc.nextLine();

        // check evenOdd methos/function, true means even , false means odd
        boolean c = test.evenOdd(num);
        System.out.println(c);

        sc.close();

    }
}
