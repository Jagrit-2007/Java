package QUESTIONS.Arrays2D;

public class questions {
    public static void main(String[] args) {
        
        // Sum of all elements of matrix

        int[][] matrix1= {{1,2,3}, {4,5,6}, {7,8,9}}; // 3x3 matrix
        int[][] matrix2= {{1,2,3}, {4,5,6}, {7,8,9}}; // 3x3 matrix

        int sumElements = 0;
        for(int[] r : matrix1)
        {
            for(int val : r)
            {
                sumElements += val;
            }
        }
        System.out.println("Sum of all elements of matrix: " + sumElements); // 45

        // Sum of rows

        int rowSum = 0;

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1[i].length;j++)
            {
                rowSum += matrix1[i][j];
            }
            System.out.print(rowSum + " ");
            rowSum = 0; // after "i"th row sum is done by "j" th elements,, it sets rowSum value to 0 for next row.
        }
        System.out.println();

        // Sum of columns

        int sumCol = 0;

        for(int j = 0; j < matrix1[0].length; j++)
        {
            for(int i = 0; i < matrix1.length; i++)
            {
                sumCol += matrix1[i][j];
            }
            System.out.print(sumCol + " ");
            rowSum = 0;
        }
        System.out.println();

        // Sum of left diagonal (top left to bottom right)

        int leftDiagonalSum = 0;

        // for(int i = 0; i < matrix1.length; i++)
        // {
        //     for(int j = 0; j < matrix1[i].length; j++)
        //     {
        //         if(i == j)
        //         {
        //             leftDiagonalSum += matrix1[i][j];
        //         }
        //     }
        // }
        // System.out.println("Left diagonal Sum: " + leftDiagonalSum);

        for(int i = 0; i < matrix1.length; i++)
        {
            leftDiagonalSum += matrix1[i][i];
        }
        System.out.println("Left Diagonal Sum : " + leftDiagonalSum);

        // Sum of anti diagonal (top right to bottom left)

        int rightDiagonalSum = 0;

        // for(int i = 0; i < matrix1.length; i++)
        // {
        //     for(int j = matrix1[i].length - 1; j >= 0; j--)
        //     {
        //         if(i + j == matrix1.length - 1)
        //         {
        //             rightDiagonalSum += matrix1[i][j];
        //         }
        //     }
        // }

        for(int i = 0; i < matrix1.length; i++)
        {
            rightDiagonalSum += matrix1[i][matrix1.length - i -1]; 
            // since "j" MUST satisfy : i + j == matrix1.length - 1
            // so, j = matrix1.length - 1 - i
            // the above commented solution was less efficient since it iterated on elements which were'nt required
        }
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);

        // Sum of 2 matrix : use matrix1 and matrix2

        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1[i].length; j++)
            {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < sumMatrix.length; i++)
        {
            for(int j = 0; j < sumMatrix[i].length; j++)
            {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of a matrix 

        // Method 1 : New Matrix

        int[][] transposeMatrix = new int[matrix1[0].length][matrix1.length];

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1[i].length; j++)
            {
                transposeMatrix[j][i] = matrix1[i][j];
            }
        }

        for(int[] nums : transposeMatrix)
        {
            for(int num : nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Method 2 : Same Matrix

        int[][] matrix3= {{1,2,3}, {4,5,6}, {7,8,9}}; // 3x3 matrix

        for(int i = 0; i < matrix3.length; i++)
        {
            for(int j = i+1; j < matrix3[i].length; j++) // using i + 1 ignores the diagonal
            {
                int temp = matrix3[i][j];
                matrix3[i][j] = matrix3[j][i];
                matrix3[j][i] = temp;
            }
        }

        for(int[] nums : matrix3)
        {
            for(int num : nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Rotate matrix by 90 degrees : first transpose it and then reverse the row (i.e reverse 1d array)

        int[][] matrix4= {{1,2,3}, {4,5,6}, {7,8,9}}; // 3x3 matrix

        // create a new matrix
        int[][] rotateMatrix = new int[matrix4[0].length][matrix4.length];

        // transpose it
        for(int i = 0; i < matrix4.length; i++)
        {
            for(int j = 0; j < matrix4[i].length; j++)
            {
                rotateMatrix[j][i] = matrix4[i][j]; 
            }
        }

        // reverse 1d array one by one
        for(int i = 0; i < rotateMatrix.length; i++) // accesing the row
        {
            int left = 0;
            int right = rotateMatrix[i].length - 1;

            while(right >= left)
            {
                int temp = rotateMatrix[i][left]; // "i"th row and "left" index element
                rotateMatrix[i][left] = rotateMatrix[i][right];
                rotateMatrix[i][right] = temp;

                left++;
                right--;
            }
        }

        // print the rotated array
        for(int[] nums : rotateMatrix)
        {
            for(int num : nums)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication : use matrix1 and matrix2





        // Spiral Matrix

        // 2x2 Determinant

        // 3x3 Determinantttt










    }
}
