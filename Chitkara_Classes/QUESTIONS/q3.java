package Chitkara_Classes.QUESTIONS;

public class q3 {
    
    static int add(int a, int b, int c){

        int res = a + b + c;
        return res;
    }

    static float add(float a, float b, float c, float d, float e){

        float res = a + b + c + d + e;
        return res;
    }

    static double add(double a, double b, double c, double d){

        double res = a + b + c + d;
        return res;
    }
    public static void main(String[] args) {
        
    // Implement the add() method using method overloading and it should accept 3 int values, 5 float values and 4 double values

    int res1 = add(10,30,49);
    System.out.println(res1);

    // specify that it's a float value by "f"
    float res2 = add(9.2f,29.44f,48.4f,0.3f,6.6f);
    System.out.println(res2);

    // specify that it's a double value by "d"
    double res3 = add(924.2d,38.29d,388.244d,92.2d);
    System.out.println(res3);
    }
}
