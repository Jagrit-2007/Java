package OOPS.ExtraTopics;

// Parent class : superclass
class Animal{

    void move(){
        System.out.println("This animal is running.");
    }
}

// Child class : subclass
class Dog extends Animal{

}

// Child class : subclass
class Cat extends Animal{

}

// METHOD OVERRIDING :

// Child class : subclass
class Fish extends Animal{
    
    // Fish can swimm but not run, so we'll write a specific method with same name that overrides the general method
    // It is a good practice to write "@Override" so that other developer could know that the below method id overrided
    // Method overriding have more precedence
    
    @Override 
    void move(){
        System.out.println("Fish is swimming !");
    }
}

public class methodOverriding {
    
    public static void main(String[] args) {
        
        // Method overriding : when a subclass(child class) provides it's 
        //                     OWN implementation of a method is already defined, it allows code reusability & specific implementations

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Fish fish1 = new Fish();

        dog1.move();
        cat1.move();
        fish1.move();
    }
}
