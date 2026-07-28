package ARRAYS;

public class Main {
    public static void main(String[] args) {
        
        // 2D ARRAYS : It's a multidimensional array 

        // 1D ARRAYS

        // String[] fruits = {"apple", "banana", "orange"};
        // String[] vegetables = {"tomato", "onion"};
        // String[] meats = {"chicken", "lamb", "fish", "seaFood"};

        // 2D / MULTIDIMENSIONAL ARRAY

        String[][] multiDimensionalArray = {{"apple", "banana", "orange"},
        {"tomato", "onion"},
        {"chicken", "lamb", "fish", "seaFood"}};

        for(int i = 0; i <multiDimensionalArray.length; i++) // it tells total rows
        {
            for(int j = 0; j < multiDimensionalArray[i].length; j++) // [i] is used to specify no . of columns in that row
            {
                System.out.print(multiDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
