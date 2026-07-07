package Chitkara_Classes.Methods_functions;

public class positiveNum {
    void isPositive(int num){
        if(num > 0){
            System.out.println("Positive");
        }
        else if(num == 0){
            System.out.println("Number is 0");
        }
        else{
            System.out.println("Negative");
        }
    }

    public static void main(String[] args){

        positiveNum obj = new positiveNum();

        obj.isPositive(100);
        obj.isPositive(0);
        obj.isPositive(-5);
    }
}
