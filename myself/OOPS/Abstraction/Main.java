package OOPS.Abstraction;

// Making "Shape" an abstract class so that not everyone can use, it's mainly for security purposes.
abstract class Shape{

    abstract double area(); // abstract methods do not share any body.
    
    void display(){ // Concrete method, other classes inherit this, It's just a normal method like we did in other topics
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length, double breadth){

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area(){
        return length * breadth;
    }
}

class Circle extends Shape{

    double radius;

    Circle(double radius){

        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}

public class Main {
    
    public static void main(String[] args) {
     
        // Abstract : Used to define abstract classes and methods
        // Abstraction is the process of hiding implementation details & showing only the essential features
        // Abstract classes CAN'T be instantiated directly, means we can't create any object from this class
        // Can contain "abstract" methods (which must be implemented)
        // Can contain "concrete" methods (which are inherited)

        // Shape shape = new Shape(); this will give an error because Shape is an abstract class
        // we dont want people to see implementation but only showing essential and required features.

        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(1.1);
        Triangle triangle = new Triangle(5,2);

        System.out.println(rectangle.area()); 
        System.out.println(circle.area()); 
        System.out.println(triangle.area());

        rectangle.display(); // display method is the concrete method because it's inherited from parent class
        circle.display();
        triangle.display();

    }
}
