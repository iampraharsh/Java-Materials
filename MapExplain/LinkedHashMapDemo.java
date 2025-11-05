package MapExplain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // order me rehta hai
        // Hashmap ka child hai --> LinkedHashMap
        // old wala remove hota hai --> agr cache me disk me sab full hora hai to old wala remove hoga
        // Least recently access
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true);
        linkedHashMap.put("orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);
        linkedHashMap.get("Apple");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        2nd Example

        HashMap<String, Integer> hashMap = new HashMap<>();

        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap);

        hashMap.put("shubham", 91);
        hashMap.put("Bob", 80);
        hashMap.put("Akshit", 78);
        hashMap.getOrDefault("Shubham", 0); // agar ho to shubham le kar aao warna 0 daal dena
        System.out.println(  hashMap.getOrDefault("Shubham", 0));

    }
}
