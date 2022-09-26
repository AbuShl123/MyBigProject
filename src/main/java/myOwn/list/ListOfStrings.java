package myOwn.list;

import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {
    public static void main(String[] args) {
        // create a list of strings
        List<String> str = new ArrayList<>();

        str.add("one");
        str.add("three");
        str.add("four");

        // insert an element at index 1
        str.add(1, "two");
        for (String s : str) {
            System.out.println(s);
        }

        System.out.println("-----");

        // remove an element at index 2
        str.remove(2);
        for (String s : str) {
            System.out.print(s + " ");
        }

    }
}
