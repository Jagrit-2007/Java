package Chitkara_Classes.ARRAYS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // DEFINING MULTI DIMENSIONAL ARRAYS IN JAVA

        // int[] arr1 = new int[10]; // 1d Array

        int[][] arr2 = new int[5][5]; // 2d Array

        // first bracket represent ROWS
        // second bracket represent COLUMNS

        // jab bhi outer loop ek baar chalta hai , so inner loop pura chalta hai
        // it means for 1 iteration of outer loop, its 5 time iteration of inner loop , as per this nested loop

        // Input loop
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                arr2[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        // Output loop
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.err.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    
        // SUM OF DIAGNOL

        int sum_1 = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(i == j)
                {
                    int val = arr2[i][j];
                    sum_1+=val;
                }
            }
        }
        System.out.println(sum_1);

        scanner.close();

    }
}
