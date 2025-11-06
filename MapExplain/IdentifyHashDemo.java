package MapExplain;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyHashDemo {

    public static void main(String[] args) {


        // ek Class hai jiske ander Hashcode nahi hai to Object class ka hashcode use hoga (object class ka memory ke sath khelna hota hai)
        // String class ka apna hashcode hota hai based on "key" value
        String key1 = new String("key");
        String key2 = new String("key");

        Map<String, Integer> map = new HashMap<>();
//                        or
//        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 1);
        map.put(key2, 2);
        //insert karne ja rahe hai and jo already present hai vo Equal to nahi hai iska matalb collision hai to linklist me jayega
        // agar equal hai to replace kar do
        System.out.println(key1.equals(key2)); // ye true hai to replace ho jayega
        System.out.println(map); // {key=2}
    }
}

//IdentityHashMap me kya hota hai --> chaye aapke class me hashcode ho ya na ho IdentityHashMap me object ka hashcode hi chalega
// IdentityHashMap output--> {key=1, key=2}
