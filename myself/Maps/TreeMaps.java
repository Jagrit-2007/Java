package Maps;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    
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
    public static void main(String[] args) {
        
        Map<Integer, String> treeMap1 = new TreeMap<>();

        treeMap1.put(104, "Alice");
        treeMap1.put(843, "Meoww");
        treeMap1.put(38, "bhauuu");
        treeMap1.put(490, "yuuhii");

        // Iterating over TreeMap, to check whether, using advanced for loop

        // entrySet() is a built-in method that bundles a Map's key-value pairs into a standard Set so that Java can iterate over them.
        // .getKey() and .getValue() are two built in getter methods of Entry, which pulls data out of Map.Entry
        // .getKey() gets unique key , and .getValue() retrives actual data
        
        for(Map.Entry<Integer, String> entry : treeMap1.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
