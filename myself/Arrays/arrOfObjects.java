package Arrays;

class Car{

    String model;
    String color;

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
public class arrOfObjects {
    public static void main(String[] args){

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Mercedez", "White");
        Car car3 = new Car("BMW", "Black");

        // creating an array of object of any class
        Car[] cars = {car1, car2, car3};

        // enhanced loops
        for(Car car : cars)
        {
            car.drive();
        }
        // normal loop
        for(int i = 0; i < cars.length; i++)
        {
            cars[i].drive();
        }
    }
}
