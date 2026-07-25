package Questions.LogicalQues;
import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("enter the number: ");
        num = scanner.nextInt();

        int org = num; 
        int rev = 0, remainder;

        while(num > 0){
            remainder = num % 10;
            rev = (rev * 10) + remainder;
            num /= 10;
        }

        String result = (org == rev) ? "Palindrome" : "Not Palindrome";
        System.out.println(result);
        
        scanner.close();
    }

}
