package Chitkara_Classes.ArrayList;
import java.util.List; // import java.util.List;
import java.util.ArrayList; // import java.util.ArrayList;
import java.util.Scanner;;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Array list is dynamic, it stores element in contigous memory locations , fast O(1) random access 

        List<Integer> list = new ArrayList<>(); // default value is 10
        
        list.add(98);
        list.add(12);
        list.add(13);

        System.out.println(list.get(2)); // passed index

        int letGreatest = list.get(0);

        for(int nums : list)
        {
            if(letGreatest < nums)
            {
                letGreatest = nums;
            }
        }

        System.out.println(letGreatest);

        int letSmallest = list.get(0);

        for(int nums : list)
        {
            if(letSmallest > nums)
            {
                letSmallest = nums;
            }
        }

        System.out.println(letSmallest);

        // ****************************************************************

        List<String> nameList = new ArrayList<>();

        for(int i = 0; i < 5; i++)
        {
            String name = scanner.nextLine();
            nameList.add(name);
        }

        for(String names : nameList)
        {
            System.out.println(names);
        }

        System.out.println(nameList.size());
        
        scanner.close();

    }
}
