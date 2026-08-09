package Loops;

public class forLoop {
    public static void main(String[] args) {
    
        // for loops: execute some code for certain amount of time, we use it when we know no. of iteration or when conditon is satisfied
     
        // (initializing; condition; step) ,,, i is loop control variable,,, step is increment or decrement

        // increment by 1

        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }
        for (int j = 0; j < 10; j++){
            System.out.println(j);
        }

        // decrement by 1

        for (int k = 10; k >= 0; k--){
            System.out.println(k);
        }
        for (int l = 10; l > 0 ; l--){
            System.out.println(l);
        }

        // increment by 2

        for (int i = 0; i <= 10; i+=2){ // i = i + 2
            System.out.println(i);
        }

        // decrement by 2

        for (int j = 10; j >=0 ; j-=2){ // j = j -2
            System.out.println(j);
        }

        // New Year countdown program

        int start = 10;

        for (int i = start; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("HAPPY NEW YEAR !");
    }
}
