package Chitkara_Classes.CONSTRUCTORS;

class StudentData {
    String name;
    int roll;
    int marks;

    StudentData(String n, int r, int m) {
        name = n;
        roll = r;
        marks = m;
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}

public class Student {
    public static void main(String[] args) {
        StudentData s1 = new StudentData("Hoi", 101, 95);
        s1.display();
    }
}
