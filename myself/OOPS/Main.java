package OOPS;
import java.util.Scanner;

class Car{
        
    String carName = "BMW";
    String model = "M6";

}

class Info{

    String name = "jagrit";
    int age  = 18;
    
    void display(){
        
        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Object : an entity that holds data and can perform actions , it's a reference data type
        // objects are stored in heap memory

        Scanner sc = new Scanner(System.in); // here "sc" is object
        // we create an object by "new" keyword, it allocates memory in heap

        Car car = new Car();
        Info info = new Info();
        
        // to access an attribute use '.' operator after object name and followed by attribute name
        
        System.out.println(car.carName); // so car is object then DOT then attribute name
        System.out.println(car.model);

        // accessing an method by DOT '.' operator

        info.display();
        

        sc.close();

    }
}
