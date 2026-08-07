package OOPS.Inhertitence;

// parent class
class Person{

    String firstName;
    String lastName;

    Person(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName(){
        System.out.println(firstName + " " + lastName);
    }
}

// child class , using firstName & lastName of Person
class Student extends Person{

    double gpa;

    Student(String firstName, String lastName, double gpa){

        // USING "super" KEYWORD : it calls parent class attributes and methods i.e here it calls constructor Person of Person class
        // It MUST be in the first line of child Constructor
        super(firstName, lastName);
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(firstName + "'s GPA is : " + gpa);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        
        // super = refers to the parent class. So, parent classes are superclasses and child classes are subclasses
        // used in constructors and method overriding 
        // calls the parent constructor to initialize attributes

        Person p1 = new Person("Jagrit", "Bansal");
        Student s1 = new Student("Jagrit", "Bansal", 9.98);

        p1.showName();
        s1.showGPA();
    }
}
