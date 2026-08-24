package Composition;

class Car{

    String model;
    int year;
    Engine engine; // engine objects

    Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        // creating engine object in "Car" class
        this.engine = new Engine(engineType);
    }
}

class Engine{

    String type;

    Engine(String type){
        this.type = type;
    }
}

public class Main {
    
    public static void main(String[] args) {
        
        // Composition : it represents a "part-off" relationship between objects 
        // for example, an Engine is "part of" a car
        // allows compelx objects to be constructed from smaller objects

        Car car = new Car("Benz", 2026, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine); // engine is an object so it gives hash value
        System.out.println(car.engine.type);

    }
}
