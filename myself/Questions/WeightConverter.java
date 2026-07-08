package Questions;
import java.util.Scanner;

public class WeightConverter {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
        }
        else{
            System.out.println("Please enter a valid choice only!");
        }

        sc.close();
    }
}
