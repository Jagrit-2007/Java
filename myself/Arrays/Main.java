package Arrays;
import java.util.Arrays; // while working with arrays you can import "Arrays" utilities

public class Main {
    
    // ARRAY : It's a collection of value of same data type 
    //        think of it like a variables storing more than 1 value

    public static void main(String[] args) {
        
        // This is how we make an ARRAY
        // Datatype[] arrayName = {"value1", "value2"};

        String[] fruits = {"Mango", "Banana"};

        System.out.println(fruits); // here we get a memory reference
        // it's because ARRAYS are reference data types and NOT Primitive

        // using index to get an element of an array , its done by using indexes: arrayName[index]
        // INDEXES STARTS FROM 0 and so, Greatest Index = length of the array - 1

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);

        // NOW IF WE TRY ACCESSING THE INDEX WHICH ISN'T IN ARRAY 
        // SO we get an error : java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        // System.out.println(fruits[2]);

        // Changing the value of an element of the array

        fruits[1] = "Kiwi";
        System.out.println(fruits[1]);

        // To check length of an array , use : ".length" inbuilt method

        System.out.println(fruits.length);

        // printing elemnts of an array

        for (int i = 0; i < fruits.length; i++){

            System.out.print(fruits[i] + " ");
        }
        
        System.out.println();

        // USING java.util.Arrays

        Arrays.sort(fruits); // so it sorts in alphabetical order
        Arrays.fill(fruits, "pineapple"); // it now filled each element of array with "pineapple"

        // Lets check
        for (int i = 0; i < fruits.length; i++){

            System.out.print(fruits[i] + " ");
        }
    }
}
