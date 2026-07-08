package Questions;
import java.util.Scanner;

public class TempConverter {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();
        sc.nextLine();

        System.out.print("Convert Celcius or Fahrenheit? (C or F) : ");
        unit = sc.nextLine().toUpperCase(); // if user enter in lowercase , it then auto goes uppercase

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%f", newTemp);

        sc.close();
    }
}
