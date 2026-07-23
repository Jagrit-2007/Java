package Loops.Patterns;

public class starPatterns {
    public static void main(String[] args) {
        
        // RIGHT ANGLED - TRIANGLE

        int num1 = 5;
        for(int i = 0; i < num1 ; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.err.println();
        }

        // INVERTED RGHT ANGLED - TRIANGLE

        int num2 = 5;
        for(int i = num2; i > 0; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // *******
        // *****
        // ***
        // *

        int num3 = 7;
        for(int i = num3; i > 0; i-=2)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        // RIGHT ALIGNED TRIANGLE

        // PYRADMID

        // DIAMOND
    }
}
