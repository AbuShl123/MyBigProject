package CYDEO.days.day57_itarable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("James", "Anna", "Emre", "Jane"));

        for (String each : names) {
            System.out.println(each);
        }
        System.out.println("---------------");

        Iterator<String> iterator = names.iterator(); // pin is created. It starts before the first element

        System.out.println(iterator.hasNext()); // checks is there any element after (from where the pin currently is)
        System.out.println(iterator.next()); // moves the pin once and returns the value of the element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
