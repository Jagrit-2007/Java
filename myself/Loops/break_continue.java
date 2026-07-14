package Loops;

public class break_continue {

    public static void main(String[] args) {
        
        // break : break out of the loop (STOP)
        // continue : skip current iteration of a loop (SKIP)

        // break 

        for (int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " "); // 1 2 3 4 
        }

        // continue

        for (int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            } // 5 will now be missing
            System.out.print(i + " "); // 1 2 3 4 6 7 8 9 10 
        }

    }
}
