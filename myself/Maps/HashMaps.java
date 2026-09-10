package Maps;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    

    // Maps : A Map in Java stores data in key-value pairs. 
    // The primary difference between HashMap and TreeMap lies in how they store and retrieve these keys under the hood.

    // 1. HashMap (Hashing): Uses a hash table. When you put a key-value pair in, 
    // it runs the key through a mathematical function (hashing) to calculate exactly where it should live in memory.
    // Advantage : Very fast , time complexitiy : O(1), used for adding removing and finding items
    // Disadvantage : DONOT maintain any order , when we print it, it gives random order
    

    // 2. TreeMap (Sorting): Uses a Red-Black Tree data structure. Every time you insert a key, 
    // it compares it to existing keys and places it in a sorted tree structure.
    // Advantage : Automatically sorts your data by keys (natural ascending order by default).
    // Disadvantage : Slower than HashMap (O(log N) time complexity) because it has to re-balance the tree upon insertions.

    // Methods :
    // 1. entrySet() is a built-in method that bundles a Map's key-value pairs into a standard Set so that Java can iterate over them.
    // 2. .getKey() and .getValue() are two built in getter methods of Entry, which pulls data out of Map.Entry
    // 3. .getKey() gets unique key , and .getValue() retrives actual data
    // 4. keySet(): Extracts only the keys (the left side of your pairs) and bundles them into a Set. Use this when you need a list of identifiers, like getting every employee's name without caring about their salary.
    // 5. values(): Extracts only the values (the right side of your pairs) and bundles them into a Collection. Use this when you need to process the data itself, like calculating total payroll, and the associated names don't matter.
    // 6. setValue(newValue): This is a command used specifically inside an entrySet() loop. When holding a specific key-value pair (Map.Entry), this method lets you overwrite the value right then and there. It updates the actual map in memory instantly.

    // 3.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Map<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(103, "Alice");
        hashMap1.put(101, "Bob");
        hashMap1.put(102, "Charlie");

        // hashmap gives random order, lets test it out, it should be 103, 101, 102

        // iterating over hashmap by enhanced for loop

        for(Map.Entry<Integer, String> entry : hashMap1.entrySet())
        {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }

        // *************************************************************************************

        Map<String, Integer> hashMap2 = new HashMap<>();

        System.out.print("Number of employees: ");
        int noOfEmployees = scanner.nextInt();

        scanner.nextLine(); // buffer clean after taking int datatype as input

        // taking user input
        for(int i = 0; i < noOfEmployees; i++)
        {
            System.out.print("Enter name of employee: ");
            String name = scanner.nextLine();

            System.out.print("Enter salary: ");
            int salary = scanner.nextInt();
            
            scanner.nextLine(); // buffer clean

            // putting data into map
            hashMap2.put(name, salary);
        }

        // employee name
        System.out.println("Employee names: ");
        for(String empName : hashMap2.keySet())
        {
            System.out.println(" - "  + empName);
        }

        // salaries total
        int salaryTotal = 0;
        for(Integer empSalary : hashMap2.values())
        {
            salaryTotal += empSalary;
        }
        System.out.println("Total salary given: $" + salaryTotal);

        // enter bonus for each employee
        System.out.print("Bonus increased to : $");
        int bonus = scanner.nextInt();

        // Mapping
        for(Map.Entry<String, Integer> entry : hashMap2.entrySet())
        {
            int oldSalary = entry.getValue();
            int newSalary = oldSalary + bonus;

            entry.setValue(newSalary);// updating map

            System.out.println(entry.getKey() + " makes $" + entry.getValue());
        }

        scanner.close();
    }
}