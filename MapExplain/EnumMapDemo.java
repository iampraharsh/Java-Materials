package MapExplain;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {


        //array of size same as enum
        //[_,"Gym",_,_,_]
        // no hashing
        //ordinal/ index is used
        // Faster then hashmap
        // Memory efficient
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "GYM");
        map.put(Day.MONDAY, "Walk");

        System.out.println(Day.TUESDAY.ordinal()); // index no
        String s = map.get(Day.TUESDAY); 
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
