package Chitkara_Classes.FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    
    public static void main(String[] args) {
        
        // File file = new File("example.txt");

        // file.createNewFile();
        // FileWriter FileWriter = new FileWriter("example.txt");
        // FileWriter.write("Hello this is new file");
        // FileWriter.close();

        // FileReader fileReader = new FileReader("example.txt");

        // int data = 0;

        // while((data=fileReader.read()) != -1)
        // {
        //     System.out.println((char) data);
        // }

        FileInputStream fileInputStream = new FileInputStream("/home/jagrit/Desktop/");
        int a = fileInputStream.read();

        System.out.println(a);
    }
}
