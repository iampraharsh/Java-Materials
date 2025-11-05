package MapExplain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer"); // hashcode1 --> index1
        map.put(p2, "Designer"); // hashcode2 --> index2
        map.put(p3, "Manager"); //hashcode 3 phele ye tha but fix karke essa kiya hai -->// hashcode1 --> index1 --> equals

        System.out.println("Direct run --> " + p1); // memory jesa print hoga


        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90); //hascode1--> index1
        map1.put("Neha", 92); //hashcode2 -->index2
        map1.put("Shuabham", 99); // hashcode3 --> index --> equal() --> replace
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;

    }

    // right click and override karna hashCode and equals

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        // har person ka alag hashcode aaye jab Equality check ho to id and name check kar le
//        return super.equals(obj);

        if (this == obj) {
            // same object check kar rahe to true kar de
            return true;
        }

        if (obj == null) {
            //current object to null ke sath check kar rahe hai
            return false;
        }

        if (getClass() != obj.getClass()) {
//            two differnt class check
            return false;
        }

        Person other = (Person) obj; // casting
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
