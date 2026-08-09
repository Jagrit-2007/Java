package OOPS.Inheritence;

class Animal{

    boolean isAlive;

    Animal(){
        isAlive = true;
    }

    void eat(){
        System.out.println("The animal is eating");
    }
}

// by "extend" keyword we inherit properties , attributes and methods of parent class

// here Dog is child & Animal is parent
class Dog extends Animal{

}

// here Cat is child & Animal is parent
class Cat extends Animal{

}

public class Main {
    public static void main(String[] args) {
        
        // Inhertitence : one class inherits the attributes and methods from another class
        // just like child inherits it's properties from parents , even parents can inherit from their parent
         
        // Creating objects of child classes to check if they have inhertied the properties & attributes of parent class

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        System.out.println(dog1.isAlive);
        System.out.println(cat1.isAlive);

        dog1.eat();
        cat1.eat();
    }
}
