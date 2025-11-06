package MapExplain;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        //HashTable is Synchronized (thread Safe)
        //no null key or value
        // Leagcy Class --> new aaya hai ConcurrentHashMap
        //Slower than HashMap
        // all methods are synchronized like get

        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        System.out.println(hashtable);
        System.out.println("Value for key 2" + hashtable.get(2));
        System.out.println("Does key 3 exist" + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("After Removing key 1 : " + hashtable);

//        hashtable.put(null,"value"); // Throw Exception because of null
//        hashtable.put(4,null);  // Throw Exception because of null
    }
}
