package OOPS.constructors;

class Data{

    String name;
    int age;
    String email;

    // the below are special methods called Constructors, means they have
    // same name as of class
    // BUT these are "Overloaded Constructors because"
    // Same name of constructors BUT different parameteres

    Data(String name){
        this.name = name;
        this.age = age; // defualt value = 0
        this.email = email; // default value = null
    }

    Data(String name, int age){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    Data(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // display method
    void display(){

        System.out.printf("Your name: %s\n", this.name);
        System.out.printf("Your age: %d\n", this.age);
        System.out.printf("Your email: %s\n", this.email);
    }
}

public class overloadConstructor {
    public static void main(String[] args) {
        
        // making object of 1st constructor
        Data info1 = new Data("Jagrit");
        // using method by object.display()
        info1.display();

        Data info2 = new Data("Jagrit", 18);
        info2.display();

        Data info3 = new Data("Jagrit", 18, "hello123@gmail.com");
        info3.display();

    }
}
