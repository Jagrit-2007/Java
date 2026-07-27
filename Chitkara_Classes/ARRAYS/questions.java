package Chitkara_Classes.ARRAYS;

public class questions {
    
    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int[][] arr2 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        // SUM ROW WISE
        
        int sum_1 = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                sum_1 += arr1[i][j];
            }
        }
        System.out.println("Sum of array : " + sum_1);

        // GREATEST NUMBER FROM 2d ARRAY

        // SMALLEST NUMBER FROM 2d ARRAY

        // MAKE 3x3 TWO MATRIX AND SUM EACH ELEMENT CORRESPONSING TO ITS POSTION AND CREATE A NEW MATRIX OF IT

        // FIND DETERMINANT OF MATRIX   

    }
}
