package CC2.revision;
import java.util.Scanner;
import java.util.Arrays; // for sorting arrays

public class quesss {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner(System.in);

        // Find greatest in matrix and its row and column
        int[][] matrix1 = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};

        int letGreatest = matrix1[0][0];
        int row = 0;
        int col = 0;

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1[i].length; j++)
            {
                if(matrix1[i][j] > letGreatest)
                {
                    letGreatest = matrix1[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        System.out.println("Max : " + letGreatest);
        System.out.println("Row : " + row);
        System.out.println("Column : " + col);

        // Binary Search in 1D array
        int[] arr1 = new int[10];
        System.out.println("Enter 10 numbers : ");

        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = scanner.nextInt();
        }



        // Binary search in 2D array
        // int[][] matrix2 = new int[3][3];

        // for(int i = 0; i < 3; i++)
        // {
        //     for(int j= 0; j < 3; j++)
        //     {
        //         matrix2[i][j] = scanner.nextInt();
        //     }
        // }

        // int target2 = 34;



        // scanner.close();
    }
}
