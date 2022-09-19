package CYDEO.days.day45_polimorphysm.learn_collections;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add(null);
        list1.add('c');
        list1.add('c');
        System.out.println(list1);
        // list1.sort(Comparator.comparingInt(Character::charValue));
        // System.out.println(list1);

        List<Character> list2 = new LinkedList<>();
        list2.add('a');
        list2.add('b');
        list2.add(null);
        list2.add('c');
        list2.add('c');
        System.out.println(list2);

        List<Character> list3 = new Vector<>();
        list3.add('a');
        list3.add('b');
        list3.add(null);
        list3.add('c');
        list3.add('c');
        System.out.println(list3);
    }
}
