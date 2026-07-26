package Chitkara_Classes.CONSTRUCTORS;

class Passing {

    String name;
    int age;

    // Constructor
    Passing(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Passing obj = new Passing("Calix", 100);

        obj.display();
    }
}