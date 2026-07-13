package Chitkara_Classes.ClassObjects;

public class Carinfo {
    
    String carName;
    double price;
    String numberPlate;
    String model;

    public void display(){
        System.out.println("You choose: " + carName + " !");
        System.out.println("The model of " + carName + " is "+ model);
        System.out.println("Price of " + carName + " , and model "+ model + " is: " + price);
        System.out.println("Number plate: " + numberPlate);
    }
}
