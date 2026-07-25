package Arrays;

public class searchArray {
    public static void main(String[] args) {
        
        int arr1[] = {1,4,5, 4, 32, 36, 6, 9, 48, 0};
        String arr2[] = {"apple", "banana", "mango", "pineapple"};
        int target1 = 90;
        String target2 = "mango";
        boolean isFound1 = false; // default value we give for boolean is "false"
        boolean isFound2 = false;

        // LINEAR SEARCH : iterate from start to end

        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] == target1)
            {
                System.out.println("Element found at index: " + i);
                isFound1 = true;
                break;
            }
        }
        if(!isFound1)
        {
            System.out.println("ELEMENT NOT FOUND!");
        }

        for(int i = 0; i < arr2.length; i++)
        {

            if(arr2[i].equals(target2)){
                System.out.println("Element found at index: " + i);
                isFound2 = true;
                break;
            }
        }
        if(!isFound2)
        {
            System.out.println("ELEMENT NOT FOUND");
        }

        // ***************************************************************************
    }
}
