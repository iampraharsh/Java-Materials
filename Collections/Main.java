package Collections;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//class MyComparator implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//}


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

public class Main {


    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1); // 0
//        list.add(4); //1
//        list.add(33); //2
//
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        list.remove(2);
//
//        for (int x : list) {
//            System.out.println("For Each loop: " + x);
//        }
//
//        System.out.println(list.contains(5)); // boolean value
//        System.out.println(list.contains(4)); // boolean value


        // //  Creating arrayList
//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        System.out.println(list1.getClass().getName());
//
//        list1.set(1, "Wednesday");
//        System.out.println(list1.get(1));
//
//
//        String[] array = {"Apple", "Banana", "Cherry"};
//        List<String> list2 = Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//
//        List<Integer> list3 = List.of(1, 2, 3, 4);
////        list3.set(1,33);
//        System.out.println(list3.getClass().getName());


//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(1);
//        list.add(3);
//
//        list.sort(null);
//        System.out.println("ascending" + list);
//
//        list.sort(new MyComparator());
//        System.out.println(list); // [3, 2, 1]


//        List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort(new StringLengthComparator());
//        words.
//        System.out.println(words);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);
    }
}
