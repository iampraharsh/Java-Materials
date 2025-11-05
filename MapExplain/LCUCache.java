package MapExplain;


import java.util.LinkedHashMap;
import java.util.Map;

// Least Recently Used
public class LCUCache<K, V> extends LinkedHashMap<K, V> {

    public int capacity;

    public LCUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    //LinkedHashMap me ek removeEldestEntry method hota hai use generate kar ke overide karna hota hai

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LCUCache<String, Integer> studentMap = new LCUCache<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.get("Bob"); // first one rahega 2nd wala remove hoga "Alice"
        studentMap.put("Vipul", 89);

        System.out.println(studentMap); // output--> {Ram=91, Bob=99, Vipul=89}

    }
}
