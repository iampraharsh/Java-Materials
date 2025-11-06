package MapExplain;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {
        // Map ko sorted hoti hai based on keys
        //TreeMap-->(alternate word) Red black Tree
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> a - b);

        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(79, "Vipul");
        System.out.println(map);

        //SortedMap special methods

        System.out.println("firstkey: " + map.firstKey());
        System.out.println("lastkey: " + map.lastKey());
        System.out.println("headMap: " + map.headMap(91)); // head tak leke aa
        System.out.println("tailMap: " + map.tailMap(91)); // 91 se tail tak leke aao
        System.out.println("SubMap: " + map.subMap(78, 91)); // kaha se kaha tak chaiye
    }
}
