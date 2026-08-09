package OOPS.Polymorphism;
import java.util.Scanner;

// abstract class so that no one can make any object of Animal
abstract class Animal{

    abstract void speak(); // asbtract methods have "NO" body
}

class Dog extends Animal{

    @Override
    // abstract methods need access modifiers 
    public void speak(){
        System.out.println("Bhauuu bhauuuu !!");
    }
}

class Cat extends Animal{

    @Override
    public void speak(){
        System.out.println("Meoww meoww !!");
    }
}

public class runtime {
    
    public static void main(String[] args) {
        
        // Runtime polymorphism : when the method that gets executed is decided 
        //                        at runtime based on the actual type of the object 

        // Runtime Polymorphism (overriding & dynamic): Requires a Parent Reference pointing to a Child Object (Parent p = new Child()) to achieve Runtime Polymorphism
        // so that actual object is stored in memory of child type

        // Animal animal =  new Animal(); // Abstract classes can not be instantiated , means can create object of class

        Scanner scanner = new Scanner(System.in);

        Animal animal; // we have just declared "BUT NOT" instantiate, 
        // It could be either , Animal animal = new Dog(); or Animal animal = new Cat();

        // So, choice will be made during "Runtime" and it's dynamic and achived by "Overriding"
        // So, it's called Runtime polymorphism
        
        System.out.print("What do you like ? (1 = Dog or 2 = Cat): ");
        int choice = scanner.nextInt();

        if(choice == 1)
        {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2)
        {
            animal = new Cat();
            animal.speak();
        }
        else
        {
            System.out.println("Please enter a valid choice !");
        }

        scanner.close();
    }
}