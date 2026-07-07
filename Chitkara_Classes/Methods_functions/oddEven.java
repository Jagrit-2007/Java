package Chitkara_Classes.Methods_functions;

public class oddEven {
    void isEven(int a){
        if(a % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        
        oddEven obj = new oddEven();

        obj.isEven(5);
    }
}
