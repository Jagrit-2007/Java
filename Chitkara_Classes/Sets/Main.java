package Chitkara_Classes.Sets;
import java.util.HashSet;
import java.util.Iterator; // import java.util.Iterator, to iterate over set
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        

        // Set stores ONLY unique value;
        // Set have NO INDEX FORMATTING , so we use Iterator

        Set<Integer> numSet1 = new HashSet<>(); // doesnt store in any order
        Set<Integer> numset2 = new LinkedHashSet<>(); // follows insertion order
        Set<Integer> numSet3 = new TreeSet<>(); // follows sorted order 

        // check line number 82, Method 2
        // Iterator to iterate over set , it have two methods to use : iteratorName.hasNext() and iteratorName.next();
        // Iterator<Integer> iterator0 = numSet1.iterator(); 

        // Hash Set
        numSet1.add(29);
        numSet1.add(322);
        numSet1.add(42);
        numSet1.add(24);
        numSet1.add(2);

        System.out.println(numSet1); // [322, 2, 24, 42, 29] , follows NO order


        // Linked Hash Set
        numset2.add(224);
        numset2.add(472);
        numset2.add(99);
        numset2.add(189);
        numset2.add(92);

        System.out.println(numset2); // [224, 472, 99, 189, 92] , follows insertion order

        
        // Tree Set
        numSet3.add(39);
        numSet3.add(11);
        numSet3.add(0);
        numSet3.add(9);
        numSet3.add(78);

        System.out.println(numSet3); // [0, 9, 11, 39, 78] , follows sorted order



        // Remove duplicates from Array 
        // Steps: create a new set, add the elements of array into it which remove duplicates, then add those elements in new array

        // Mehtod 1, Iterating in set by "enhanced loop"
        int[] arr = new int[] {1,2,3,1,2,3,4,6,7,6,5,7,8,9};

        Set<Integer> set = new HashSet<>();

        for(int num : arr)
        {
            set.add(num);
        }

        int[] ans = new int[set.size()];

        int i = 0;

        for(int num : set)
        {
            ans[i] = num;
            i++;
        }

        for(int num : ans)
        {
            System.out.print(num + " "); // 1 2 3 4 5 6 7 8 9
        } 

        // Method 2 , Iterating in set by "Iterator" : hasNext() and next() 
        int[] arr1 = new int[] {1,2,3,1,2,3,4,6,7,6,5,7,8,9};

        Set<Integer> set1 = new HashSet<>();

        Iterator<Integer> iterator1 = set1.iterator(); // to iterate over set1

        for(int num: arr)
        {
            set1.add(num);
        }

        int[] ans1 = new int[set.size()];

        int j = 0; 

        while(iterator1.hasNext())
        {
            ans1[j] = iterator1.next();
            j++;
        }

        for(int num: ans1)
        {
            System.out.print(num + " ");
        }
    }
}