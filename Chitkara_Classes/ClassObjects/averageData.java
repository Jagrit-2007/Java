package Chitkara_Classes.ClassObjects;

public class averageData {

    double maths = 0;
    double phy = 0;
    double chem = 0;
    double avg = 0;

    // here we can do "public" or "private" . if we use private so we can't use this display method
    void display(){
        avg = ( maths + phy + chem ) / 3;
        System.out.println("average is: " + avg);
    }
}
