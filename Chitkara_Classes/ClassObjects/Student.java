package Chitkara_Classes.ClassObjects;

public class Student {
    public static void main(String[] args) {
        
        // we store variables in different class like in this case we did in averageData
        // then we made 2 objects s1 and s2;
        StudentData s1 = new StudentData();
        StudentData s2 = new StudentData();

        s1.name = "Jagrit Bansal";
        s1.age = 18;
        s1.roll = 0231;
        s2.name = "wohooo";
        s2.age = 19;
        s2.roll = 1990;

        // display is the method

        s1.display();
        s2.display();
    
    }

}
