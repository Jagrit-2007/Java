package Chitkara_Classes.Array_strings;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Arrays and String
        // Classes are stored in heap memory

        String []name = new String[5];
        name[0] = "Name1";
        name[1] = "Name2";
        name[2] = "Name3";
        name[3] = "Name4";
        name[4] = "Name5";
        // name[5] = "Name6"; // ERROR : ArrayIndexOutOfBoundsException

        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        sc.close();
    }
}
