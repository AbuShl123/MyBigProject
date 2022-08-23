package CYDEO.days.day32_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class l1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        words.add("Shoes");

        words.add(1, "Jacket");
        words.add(0, "Towel");
        words.add(1, "Car");
        System.out.println(words);

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,23,4,2,23,7,23,8,23,10));
        System.out.println(numbers);

        numbers.removeAll(Collections.singleton(23));
        System.out.println(numbers);
    }
}
