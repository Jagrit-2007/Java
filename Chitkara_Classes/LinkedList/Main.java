package Chitkara_Classes.LinkedList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        // Linked list stores elements in scattered nodes where each element contains data and a reference 
        // Slow random access O(n)

        List<Integer> numList = new LinkedList<>();

        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(400);
        numList.add(500);

        numList.get(1);

        numList.remove(0);

        for(int nums: numList)
        {
            System.out.println(nums);
        }

        System.out.println(numList.size());
    
    }
}
