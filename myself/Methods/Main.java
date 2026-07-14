package Methods;

 // Method : a block of reusable code that is executed when called ()

public class Main {
    public static void main(String[] args) {

        String name1 = "Jagrit Bansal";
        int age1 = 18;

        String name2 = "Kamran";
        int age2 = 19;
        
        happyBirthday(name1, age1); // passing arguments while calling funtions
        System.out.println();
        happyBirthday(name2, age2);
    }

    // since we'll be using this "happyBirthday"method in our main() method, so we need to use "static" keyword
    // void means we dont want to return anything
    
    // methods are not familiar with variables used inside the other methods
    // means , if we use name and age in main() method, so happyBirthday() method can't use it
    // so we pass arguments while calling the function and use parameteres in defining method

    static void happyBirthday(String name, int age){

    // parameters defined, we define it by telling which datatype we are going to recive as argument followed by name

        System.out.printf("HAPPY BIRTHDAY TO YOU %s\n!", name);
        System.out.printf("YOU ARE NOW %d YEARS OLD!\n", age);
    }
}
