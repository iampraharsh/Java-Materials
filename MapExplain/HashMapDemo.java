package MapExplain;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(17, 0.5f);

        map.put(33, "Akshit");
        map.put(2, "Neha");
        map.put(13, "Shubham");
        map.put(34, "Ram");
//        map.put(null, "Vipul");
//        map.put(null, "Praharsh"); // only one null value will be there

//        map.remove(34);
        map.remove(34, "Ram");
        System.out.println(map);


        String student = map.get(2);
        System.out.println(student);

//        boolean value
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Shubham"));


        //loop chalana hai to and display all name

        Set<Integer> keys = map.keySet();

        for (int i : keys) {
            System.out.println(map.get(i));
        }

        //loop chalana hai jisme muzhe key value chaiye

        Set<Map.Entry<Integer, String>> entries = map.entrySet(); // key : value collections


//        for (int i: entries){}  // give alt + space intlgi will give you syntax

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        List<Integer> list = Arrays.asList(2, 4, 5, 22, 53, 56);
        list.contains(32); // linear Search which is very slow as compared to map
        System.out.println(list.contains(53));
    }
}
