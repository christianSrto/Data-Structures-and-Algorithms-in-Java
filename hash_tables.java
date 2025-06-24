import java.util.*;

public class hash_tables {
    // Hashtable = A data structure that stores unique keys to values 
    //             Each key/value pair is known as an Entry
    //             Fast insertion, look up, deletion of key/value pairs
    //             Not ideal for small data sets, great with large data sets


    // hashing = takes a key and computes an integer (formula will vary based on key & data type)
    //           In a hashtable, we use the has % capacity to calculate an index number
    //           key.hashCode() % capacity = index

    // bucket = an indexed storage location for one or more Entries
    //          can store multiple entries in case of a collision (linked similarly a LinkedList)

    // collision = hash function generates the same index for more than one key 
    //             less collisions = more efficieny

    // runtime complexity: Best case O(1), Worst case O(n)

    public static void main(String[] args) {
        // <key, values> (capacity, load factor)
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        //table.remove(777);


        // smaller capacity can lead to more collisions
        Hashtable<String, String> stringTable = new Hashtable<>(21);
        stringTable.put("100", "Spongebob");
        stringTable.put("123", "Patrick");
        stringTable.put("321", "Sandy");
        stringTable.put("555", "Squidward");
        stringTable.put("777", "Gary");
        

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + " " + key + " " + table.get(key));
        }


        for (String key : stringTable.keySet()) {
            System.out.println(key.hashCode() % 21 + " " + key + " " + table.get(key));
        }
    }
}
