package OOPS.Polymorphism;

// Polymorphism STRICTLY requires "Method Overrdiding" or "Method Overloading"

// 1. Overloading (compiletime & static) is always Polymorphism

// 2. Runtime (overriding & dynamic): Requires a Parent Reference pointing to a Child Object (Parent p = new Child()) to achieve Runtime Polymorphism
//    so that actual object is stored in memory of child type

// Abstract superclass
abstract class Vehicle{

    abstract void go(); // abstract method 
}

// subclass
class Car extends Vehicle{

    String name;

    // Constructors
    Car(String name){
        
        this.name = name;
    }

    // overriding method
    @Override
    void go(){
        System.out.println("You are driving a " + name + " car !");
    }

}

// subclass
class Bike extends Vehicle{

    String name;

    Bike(String name){
        this.name = name;
    }

    @Override
    void go(){
        System.out.println("You are riding a " + name + " !");
    }
}

// subclass
class Boat extends Vehicle{

    @Override
    void go(){
        System.out.println("You are sailing the boat!");
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        // POPYMORPHISM : Poly means "many" morph means "shape"
        //                Objects can identify as other objects 
        //                Objects can be treated as objects of a common superclass
        // Polymorphism can not only be achived by Inheritence BUT ALSO "Interfaces"
        // interfaces overriding methods needs access modifiers like public , private, protected or default  

        // Runtime polymorphism (Dynamic polymorphism) : Overriding "&" Compiletime(Static) polymorphism : Overloading

        Car car = new Car("BMW");
        Bike bike = new Bike("H2R");
        Boat boat = new Boat();

        // Instead of doing this , create an array and iterate through it, refer line number 81
        car.go();
        bike.go();
        boat.go();
    
        // What if we make an array of Car class and store all these objects in it?
        // Car[] cars = {car, bike, boat};
        // Error : Type mismatch: cannot convert from Boat to Car

        // It means bike and boat DONOT identify as Car, and same goes for others too

        // So we will create "An array of Vehicle datatype which is a class common to all subclasses"

        Vehicle[] vehicles = {car, bike, boat};

        System.out.println(vehicles[0]); // this gives hash value as we discussed it in:  /OOPS/ExtraTopics/tostring.java

        for(Vehicle vehicle : vehicles)
        {
            vehicle.go();
        }
    }
}
