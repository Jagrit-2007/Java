package OOPS.ExtraTopics;

class Car{
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }

    // Java ki Object class ka default toString() aisa dikhta hai:
    // public String toString() {
    //     return getClass().getName() + "@" + Integer.toHexString(hashCode());
    // }
    
    // here, output comes : className@hexaValues
    // @ is seperator

    // toString() is defualt built-in method , it returns a string representation of an object by defualt
    // defualt it gives : className@hexaValues
    // So, we override it to replace the hashcode into the desired output
}

public class toString {
    
    public static void main(String[] args) {
        
        // .toString() : Method inherited from the object class.
        //               Used to return a string representation of an object.
        //               By default it returns a hash code as a unique identifier.
        //               It can be overriden to provide meaningful details.

        Car car = new Car("Ford", "Mustang ", 2025, "Red");

        // the below statement is "BEFORE" adding "Override method"

        // System.out.println(car);
        // gives a hash value , because it's an object right now
        // But we will convert it to string by "toString()"

        // the below statement is "AFTER" adding "Override method"
        System.out.println(car);
    }
}
