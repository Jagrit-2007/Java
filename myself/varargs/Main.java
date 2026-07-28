package varargs;

public class Main {

    static void add(int ... numbers){ // numbers is the array we made.. its made automatically by "{dataType ... arrayName}"
        System.out.println(numbers); // memory address of array

        int sum = 0;

        for(int num: numbers)
        {
            System.out.println(num);
            sum += num;
        }
        System.out.println(sum);


        // ALTERNATIVE

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        
        // variable arguments
        // varargs : allows a method to accept a varying number of arguments
        //           makes method more flexible, no need for overloaded methods
        //           java will pack the arguments into 
        //           ... (ellipsis)

        // Varargs allows a method to accept zero, one, or multiple arguments of the same type without needing to create overloaded 
        // methods or manually wrap items into an array. Internally, Java converts the passed arguments into an Array.

        // variable here means no. of arguments to be passed ain't fix
        // we just use it bcus to avoid overloading methods i.e to create multiple methods with same name but different arguments

        add(1,2,3); // we can pass here as many arguments as much we want

    }

}
