package JAVA_IMP.QUESTIONS.Arrays1D;

public class level1 {
    public static void main(String[] args) {
        
        // Find Missing Number

        int[] nums = {1,2,45,6,64,646,33,531,3,0,-9,4,-982,-593};
        int target = 10000;
        boolean isFound = false;

        for(int num : nums)
        {
            if(num == target)
            {
                isFound = true;
                break;
            }
        }
        if(isFound)
        {
            System.out.println("target: " + target);;
        }
        else{
            System.out.println("Target not found");
        }

        // Move Zeroes to end , IN SAME ARRAY

        int[] numbers = {1,330,0,0,0,379,38,642,284,2,0,0,324,0};

        int left0 = 0;
        int right0 = numbers.length - 1;
        int len = numbers.length;

        for(int i = 0; i < numbers.length; i++)
        {
            
        }


        for(int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();


        // Check if array is sorted and rotated

        int NUMBERS[] = {1,48,9,0,238,49,492,18,482};
        int count = 0;
        for(int i = 0; i < NUMBERS.length; i++)
        {
            if(NUMBERS[i] > NUMBERS[i+1])
            {
                System.out.println("Not sorted");
            }
            else{
                count++;
                if(count == NUMBERS.length){
                    System.out.println("Sorted");
                }
            }
        }

        // Reverse an array

        int[] arr = {1,34,420,28,4204,8,402,92};

        // 1st Method

        int[] new_arr = new int[arr.length];

        int j = 0;
        for(int i = arr.length-1; i >= 0; i--)
        {
            new_arr[j] = arr[i];
            j++;
        }
        for(int i = 0; i < new_arr.length; i++)
        {
            System.out.print(new_arr[i] + " ");
        }
        System.out.println();

        // 2nd Method

        int left = 0;
        int right = arr.length-1;

        while(right > left)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // moving
            left++;
            right--;
            
        }
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Count odd even in array

        int[] arr2 = {3,398,303,58,49,48,49,4892,404,40,9,8,7,6,1};

        int count_even = 0, count_odd = 0;

        for(int num : arr2)
        {
            if(num % 2 == 0)
            {
                count_even++;
            }
            else
            {
                count_odd++;
            }
        }
        System.out.println("Number of odd values: " + count_odd);
        System.out.println("Number of even values: " + count_even);
        // System.out.println(arr2.length);
        
        // Second largest element

        int[] arr3 = {9,494,975,0,4,5892,5802,49330,98,48,48,5,4,332};

        int greatest;
        int secGreatest = 0;
        int letGreatest = arr3[0];
        
        for(int i = 0; i < arr3.length; i++)
        {
            if(letGreatest < arr3[i])
            {
                letGreatest = arr3[i];
            }
        }
        greatest = letGreatest;
        letGreatest = 0;

        for(int i = 0; i < arr3.length; i++)
        {
            if(arr3[i] == greatest)
            {
                continue;
            }
            else
            {
                if(letGreatest < arr3[i])
                {
                    letGreatest = arr3[i];
                }
            }
        }
        secGreatest = letGreatest;
        System.out.println(secGreatest); 


        
    }
}
