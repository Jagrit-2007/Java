package JAVA_IMP.QUESTIONS.OOPS;
import java.util.Scanner;

// Very simple concept : to access any private instance , there we use Encapsulation
// for accessing a private instance : use "get" methods , Make it in the class it's defined it.. It uses "return" type
// setting value to a private instance: use "set" methods, Set its value in Constructor itself.. It uses "void"..
// set methods should also be defined in class

// superclass
interface Servicable{

    abstract double calculationServiceCost();
}

// subclass of Servicable
abstract class Vehicle implements Servicable{

    // Private instances need to be read and write by "get" or "set" methods
    private String ownerName;
    private double baseServiceFee;

    Vehicle(String ownerName, double baseServiceFee){

        this.ownerName = ownerName;
        this.baseServiceFee = baseServiceFee;

        // Setting values of these instances in Constructor
        setOwnerName(ownerName);
        setBaseServiceFee(baseServiceFee);
    }

    @Override
    // override method needs "access modifiers"
    public double calculationServiceCost(){
        return 0;
    }

    // Get methods : uses return type
    String getOwnerName(){
        return this.ownerName;
    }
    double getBaseServicefee(){
        return this.baseServiceFee;
    }
    // Set methods : uses voids
    void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    void setBaseServiceFee(double baseServiceFee){
        this.baseServiceFee = baseServiceFee;
    }

    // if user typed base fee as negative
    double isNegative(double baseServiceFee){

        if(baseServiceFee < 0)
        {
            this.baseServiceFee = 50.0;
            return baseServiceFee;
        }
        else
        {
            this.baseServiceFee = baseServiceFee;
            return baseServiceFee;
        }
    }
}

// subclass of Vehicle
class Car extends Vehicle{

    // private instance will be read and write by "get" and "set" methods
    private String engineType;

    Car(String engineType, String ownerName, double baseServiceFee){

        // directly using superclass instances by "super" to initialize base fields
        super(ownerName, baseServiceFee); // it should always be the first line of code in "Subclass Constructor"
        this.engineType = engineType;

        setEngineType(engineType);
    }

    @Override 
    public double calculationServiceCost(){
        if(engineType.equals("electric"))
        {
            return 0.8 * getBaseServicefee();
        }
        return getBaseServicefee();
    }

    String getEngineType(){
        return this.engineType;
    }
    void setEngineType(String engineType){
        this.engineType = engineType;
    }

    void display(){
        isNegative(getBaseServicefee());
        System.out.println("Owner: " + getOwnerName() + " | Final cost: $" + calculationServiceCost());
    }
}

// subclass of Vehicle
class Bike extends Vehicle{

    private int engineCC;

    Bike(int engineCC, String ownerName, double baseServiceFee){

        // directly using superclass instances by "super" to intitialize base fields
        super(ownerName, baseServiceFee); // it should always be the first line of code in "Subclass Constructor"
        this.engineCC = engineCC;

        setEngineCC(engineCC);
    }

    @Override
    public double calculationServiceCost(){
        return getBaseServicefee() + (getEngineCC() * 0.10);
    }

    int getEngineCC(){
        return this.engineCC;
    }
    void setEngineCC(int engineCC){
        this.engineCC = engineCC;
    }

    void display(){
        isNegative(getBaseServicefee());
        System.out.print("Owner: " + getOwnerName() + " | Final cost: $" + calculationServiceCost());
    }
}

public class oops2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input 1
        System.out.print("Enter choice (1 = Car , 2 = Bike) : ");
        int choice = scanner.nextInt();

        scanner.nextLine(); // buffer clean

        // Input 2
        System.out.print("Enter your name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Base Service Fee: ");
        double baseServiceFee = scanner.nextDouble();

        scanner.nextLine();

        if(choice == 1)
        {
            System.out.print("Engine type: ");
            String engineType = scanner.nextLine().toLowerCase();
            // Creating object for Car
            Car car = new Car(engineType, ownerName, baseServiceFee);
            car.display();

        }
        else if(choice == 2)
        {
            System.out.print("EngineCC: ");
            int engineCC = scanner.nextInt();

            scanner.nextLine(); // buffer clean

            // Creating object for Bike
            Bike bike = new Bike(engineCC, ownerName, baseServiceFee);
            bike.display();
        }
        else
        {
            System.out.println("Please enter a valid choice!");
        }

        scanner.close();
    }
}