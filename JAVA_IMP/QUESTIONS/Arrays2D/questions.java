package QUESTIONS.Arrays2D;

public class questions {
    public static void main(String[] args) {
        
        // MATRIX TRANSPOSE

        int[][] matrix1= {{1,2,3}, {4,5,6}, {7,8,9}}; // 3x3 matrix

        int r = matrix1.length;
        int c = matrix1[0].length;
        int[][] matrix2 = new int[c][r];

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; i < matrix1[i].length; j++)
            {
                matrix2[j][c] = matrix1[i][j];
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }
    }
}
