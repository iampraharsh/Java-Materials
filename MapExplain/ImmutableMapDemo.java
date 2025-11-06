package MapExplain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("c", 3); // throw exceptions
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89); // isme only 10 key value pair aa sakte hai
//        map3.put("Alshit", 88); // throw exception
        Map.ofEntries(Map.entry("Akshit", 99), Map.entry("Vivek", 99)); // n no. of entries daal sakte hai
        System.out.println(map3);
    }
}
