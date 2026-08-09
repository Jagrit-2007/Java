package OOPS.Encapsulation;

class Car{

    private final String model; // "final" keyword in Java is a non-acess modifier used to restrict modifications
    // It's applied on variables,methods and class. "final" is used for extra security.
    // Means, they can't be accessed or prevents method overriding or inherited by other class
    private String color;
    private int price;

    Car(String model, String color, int price){

        this.model = model;
        this.color = color;
        this.price = price;
    }

    // GET METHODS

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price + "k";
    }

    // SET METHODS

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        this.price = price;
    }

    // Will give error because we have used "final" keyword
    // void setModel(String model){
    //     this.model = model;
    // }

}
public class Main {
    
    public static void main(String[] args) {

        // Encapsulation : It's the process of bundling data (variables) and the methods that operate on that data 
        // into a single unit (class), while restricting direct access to the internal data (data hiding)."
        
        // Getters & Setters : They help protect object data and add rules for accessing or modifying them.
        // GETTERS : Methods that make a field READABLE, by "get" method
        // SETTERS : Methods that make a field WRITEABLE, by "set" method
        // Getters and setters are for controlled access by using "private" we encapsulate them

        Car car = new Car("BMW", "Black", 200);

        // Accessing .color , .model and .price will give error because all those are private

        // System.out.println(car.color + " " + car.model + " " + car.price);

        // car.model = "Benz"; // gives error because we are using "set" methods
        // System.out.println(car.color + " " + car.model + " " + car.price);

        // Using get methods

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        // Using set methods

        // car.setModel(""); // can't set because setModel doesn't exist
        car.setColor("Green");
        car.setPrice(198);

        // Using get methods

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
