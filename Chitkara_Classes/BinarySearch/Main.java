package Chitkara_Classes.BinarySearch;
public class Main {
    public static void main(String[] args) {
        
        // Binary search : "SEARCHING" algorithm in "SORTED" ARRAY

        int nums[] = {-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9}; // sorted array
        
        int target = 8; // element to be searched

        // In linear search time complexity is : O(n) because it will search element one by one .
        // But in Binary search time complexity is : O log(n)

        // finding middle element

        // left most index
        int left = 0; 

        // right most index
        int right = nums.length - 1;

        
        boolean isFound = false;

        while(left <= right)
        {
            // middle index
            int mid = (left + right) / 2;

            if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1;
            }
            else{
                isFound = true;
                System.out.println("Target is on index : " + mid);
                break;
            }
        }

        if(!isFound)
        {
            System.out.println("Target is not in the array");
        }

    }
}
