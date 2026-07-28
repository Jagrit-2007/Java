package ARRAYS;

public class moreOnArrays {
    public static void main(String[] args) {
        
        // 4x4 Matrix
        char[][] telephone = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8','9'}, {'*', '0', '#'}};

        for(int i = 0; i < telephone.length; i++)
        {
            for(int j = 0; j < telephone[i].length; j++)
            {
                System.out.print(telephone[i][j] + " ");
            }
            System.out.println();
        }
    }
}
