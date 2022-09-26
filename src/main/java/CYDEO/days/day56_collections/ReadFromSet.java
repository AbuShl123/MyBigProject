package CYDEO.days.day56_collections;

import java.util.*;

public class ReadFromSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set);
        System.out.println(new TreeSet<>(set));
        for (int v : set) {
            if (v > 10)
                System.out.println(v);
        }

        Set<String> handles = new HashSet<>();
        handles.add("daad2342w");
        handles.add("vvd324324");

        for (String v : handles) {
            if (!v.equalsIgnoreCase("daad2342w")) {
                continue;
            }
            System.out.println(v);
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3);

        List<String> list = new ArrayList<>(set3);
        System.out.println(list);
        System.out.println(list.get(0));

        // remove all duplicate occurrences of each character
        String s = "AAAAABBBBCCCCCDDDD";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString().replaceAll("[,\\[\\] ]", "")
        );
    }
}
