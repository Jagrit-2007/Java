package Arrays;
import java.util.Scanner;

public class enterUserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // defining te array and allocating it the memory

        String[] foods = new String[5]; // so 5 is the length of "foods" array

        foods[0] = "pizza"; foods[1] = "burger"; foods[2] = "pasta"; foods[3] = "pasta"; foods[4] = "pasta";

        // introducing a new way of "for" loop
        // so if we have an array and we just want to pass through it, we have a simpler way

        // for (dataType iterable_variable : array){}

        for (String food : foods){
            System.out.println(food);
        }
        System.out.println(foods.length);

        // defining new array to take inputs

        String[] arrayName = new String[5];

        for(int i = 0; i < arrayName.length; i++){
            System.out.print("Enter value: ");
            arrayName[i] = scanner.nextLine();
        }

        for(String val : arrayName){
            System.out.println(val);
        }

        scanner.close();
    }
}
