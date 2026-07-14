package Loops;

public class nestedLoops {
    
    public static void main(String[] args) {
        
        // nested loops: loops inside loop

        // first lest create a matrcies with for loops

        for(int i = 1; i <= 9; i++){
            System.out.print(i + " ");
        }

        System.out.println(); // goes to new line
        
        for(int i = 1; i <= 9; i++){
            System.out.print(i + " ");
        }

        System.out.println(); // goes to new line

        for(int i = 1; i <= 9; i++){
            System.out.print(i + " ");
        }

        System.out.println(); // goes to new line
        
        // Now lets do it by nested loops 

        // static nested loops

        for(int i = 0; i <= 2; i++){
            // in the next loop we cant use "i" as loop iterator it will give error
            for(int j =  1; j <= 9; j++){ 
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // dynamic nested loops

        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i ; j++){  // moving from down to upwards
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 6 - i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
