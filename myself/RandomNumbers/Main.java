package RandomNumbers;
import java.util.Random; // import java.util.Random to use it

public class Main {
    
    public static void main(String[] args){

        Random random = new Random(); // creating random class
        
        int num1, num2;
        double num3, num4;
        boolean isStudent;

        num1 = random.nextInt();
        num2 = random.nextInt(1,7); // here we defined the range of value , like it will be b/w 1 and 7;
        // (start, end) : start is inclusive BUT end is exclusive


        // will generate a decimal value from 0 and 1
        num3 = random.nextDouble();
        num4 = random.nextDouble() * 100000;


        // random true or false
        isStudent = random.nextBoolean();


        System.out.println(num1); // will be any random number between [-2billion, 2billion]
        System.out.println(num2);

        System.out.println(num3);
        System.out.println(num4);

        // checking isBoolean
        if(isStudent){
            System.out.println("You are enrolled as student");
        }
        else{
            System.out.println("You are NOT a student");
        }

    }
}
