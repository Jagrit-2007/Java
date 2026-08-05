package Chitkara_Classes.QUESTIONS;
import java.util.Scanner;

class Input{

    int hh, mm, ss;

    public Input(int hh, int mm, int ss){

        if(isValid(hh, mm, ss))
        {
            this.hh = hh;
            this.mm = mm;
            this.ss = ss;
        }
        else{
            System.out.println("Invalid format , Default time => 00:00:00");
            this.hh = 00;
            this.mm = 00;
            this.ss = 00;
        }
    }

    boolean isValid(int hh, int mm, int ss){
        return (hh >= 0 && hh <=23) && (mm >= 0 && mm <=59) && (ss >=0 && ss <= 59);
    }

    public void increase(){
        // increasing by 1
        ss++;
        
        if(ss == 60)
        {
            ss = 0;
            mm++;
            
            if(mm == 60)
            {
                mm = 0;
                hh++;
                
                if(hh == 24)
                {
                    hh = 00;
                    mm = 00;
                    ss = 00;
                }
            }
        }

    }

    public void display(){
        System.out.printf("TIME : %02d:%02d:%02d\n", hh, mm, ss);
    }
}
public class q2 {
    
    public static void main(String[] args) {
        
        // Creat a class and accept value using constructor
        // and accept a 3 int value
        // HH:MM:SS and create a method of increase()
        // increase the seconds by 1 second and
        // handle some of validation like time format
        // max time format will be 23:59:59 and min time will be 00:00:00

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hh = scanner.nextInt();
        System.out.print("Enter minute: ");
        int mm = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int ss = scanner.nextInt();

        Input input1 = new Input(hh, mm, ss);

        // Current time
        System.out.println("Current time");
        input1.display();
    
        // Increased by 1 second
        input1.increase();
        
        // Updated time
        System.out.println("Updated time");
        input1.display();

        scanner.close();
    }
}
