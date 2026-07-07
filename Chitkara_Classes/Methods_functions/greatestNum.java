package Chitkara_Classes.Methods_functions;

// find greatest of 2 numbers
public class greatestNum {
    int greatest(int a, int b){
        int c = Math.max(a,b); // max is built in math method : Math.max(a,b)
        return c;
    }

    public static void main(){

        greatestNum obj = new greatestNum();

        int res = obj.greatest(5,2);
        System.out.println(res);
    }
}
