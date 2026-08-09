package OOPS.Abstraction;

interface Prey{

    void flee(); // MUST HAVE NO BODY
}

interface Predator{

    void hunt(); // MUST HAVE NO BODY
}

class Rabbit implements Prey{

    @Override
    // while overriding these methods , they need "access modifiers" like public, private, default, protected
    public void flee(){
        System.out.println("Rabbit is running away");
    }
}


class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hawk is hunting");
    }
}

// by "interface" we can implement two or more super classes methods
// like here fish can be both Prey & Predator.. by Inhertitence we can inherit only 1 superclass
// BUT by Interface we can inherit multiple superclasses

class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("Fish is running from BIGGER FISH");
    }

    @Override
    public void hunt(){
        System.out.println("Fish is hunting a SMALLER FISH");
    }
}

public class Interface {
    
    public static void main(String[] args) {
        
        // Interfaces = a blueprint for a class that specifies a set of abstract methods
        //              that implementing classes MUST define
        //              Supports multiple Inheritence-like behaviour


        Rabbit rabbit = new Rabbit();

        rabbit.flee();

        Hawk hawk = new Hawk();

        hawk.hunt();

        // fish object now have both methods of two different classes Prey and Predator
        Fish fish = new Fish();

        fish.flee();
        fish.hunt();

    }
}
