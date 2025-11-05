package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addLast(4); // O(1)
        linkedList.addFirst(0); // O(1) time complexity
        linkedList.getFirst();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("cat", "Dog", "Elephant"));
        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animal.removeAll(animalToRemove); // remove common animal
        System.out.println(animal);
    }


}
