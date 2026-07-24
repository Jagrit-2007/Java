package JAVA_IMP;
public class practice {
    public static void main(String[] args) {
        
        // // Q1.
        // // *******
        // // *****
        // // ***
        // // *

        // // Q2.
        // // print every odd from 1 to 100

        // // Q3.
        // // print every number from 1 to 100

        // // Q4.
        // // Input : aaaabbbdddddg
        // // Ouput : a4b3d5g1

        // String str = "aaaabbbdddddg";
        // int n = str.length();
        // int count = 1;
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < n; i++)
        // {
        //     if(i < n - 1 && str.charAt(i) == str.charAt(i+1))
        //     {
        //         count++;
        //     }
        //     else
        //     {
        //         sb.append(str.charAt(i)).append(count);
        //         count = 1;
        //     }
        // }
        // System.out.println(sb);

        // // Q5.
        // // equals() and ==

        // // Q6.
        // // Find first repeating character in CAMERA

        // String str2 = "camera";
        // int len_str2 = str2.length();

        // for(int i = 0; i < len_str2; i++)
        // {
        //     for(int j = i+1; j < len_str2; j++)
        //     {
        //         if(str2.charAt(i)==str2.charAt(j))
        //         {
        //             System.out.println("found repeating character: " + str2.charAt(i));
        //             break;
        //         }
        //     }
        // }

        // **********************************************************************************************

        // Patterns:

        int a = 5;

        for(int i = 0; i < a; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print('*' + " ");
            }
            System.out.println();
        }

        for(int i = 1; i <= a; i++)
        {
            for(int j = a; j >= i; j--)
            {
                System.err.print('*' + " ");
            }
            System.out.println();
        }

        for(int i = 1; i <= a; i++)
        {
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = a; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // ****************************************************************************************************

        // STRINGS

        String str1 = "Jagrit Bansal";

        // string length : .lengh() , in strings we use () BUT In arrays we dont
        int length = str1.length();
        System.out.println(length);

        // charAt(index) : return character at specific index

        char ch = str1.charAt(0);
        System.out.println(ch);
        // In java there is no -1 index 
        // ch = str1.charAt(-1);
        // System.out.println(ch);

        // indexOf()

        int o = str1.indexOf("a"); // first occurence
        System.out.println(o);

        // lastIndexof("value")

        // .equals() checks primitive value only

        boolean isTrue = str1.equals("Jagrit Bansal");
        System.out.println(isTrue);

        // toUpperCase() , toLowerCase()

        String st2 = str1.toUpperCase();
        String st3 = str1.toLowerCase();

        System.out.println(st2);
        System.out.println(st3);

        // isEmpty() : to check if string is empty or not

        // replace(value1, value2) : replaces value1 with value2

        // Substring

        String sub = str1.substring(0,6); // (start, end) start is inclusive and end is exclusive
        System.out.println(sub);

        // **********************************************************************************************************************

        // ARRAYS

        int[] arr1 = {10, 20, 30, 40, 50};
        // for arrays we use .length BUT In string we use .length()
        System.out.println(arr1.length); 

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        
    }
}