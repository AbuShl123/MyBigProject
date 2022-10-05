package CYDEO.days.day60_functional_interface;

import CYDEO.days.day57_itarable.Person;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class OtherFunctionalInterface {
    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, num) -> {
            for (int v : arr) {
                if (v == num) return true;
            }
            return false;
        };


        int[] numbers = {1,4,5,2,1};
        System.out.println(contains.test(numbers, 2));

        BiConsumer<Integer, Integer> multiplicationTable = (n, max) -> {
            for (int i = 1; i < max; i++) {
                System.out.println(n + "x" + i + " = " + (n*i));
            }
        };

        multiplicationTable.accept(5, 25);

        Map<Integer, Person> classRoom = new HashMap<>(Map.of( 1, new Person("James", 35),
                                                               2, new Person("Anna", 30),
                                                               3, new Person("Jane", 32)));

        System.out.println(classRoom);

        classRoom.forEach((key, value) -> {
            System.out.println("key: " + key + " value: " + value);
        });

        // oldest person
        AtomicInteger oldest = new AtomicInteger();
        classRoom.forEach((key, value) -> {
            int num = 0;
            if (value.age > num) {
                num = value.age;
            }
            oldest.set(num);
        });

        System.out.println(oldest);

        BiFunction<Integer, Integer, Integer> maxNumber = (a, b) -> a > b ? a : b;
        System.out.println(maxNumber.apply(12, 6));

        BiFunction<Set<String>, List<Integer>, Map<String, Integer>> createMap = (emails, inbox) -> {
            List<String> listOfEmails = new ArrayList<>(emails);
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < listOfEmails.size(); i++) {
                map.put(listOfEmails.get(i), inbox.get(i));
            }

            return map;
        };

        Set<String> emails = new LinkedHashSet<>(Arrays.asList("jamoes007gmail.com", "lionlover@gmial.com", "macComputers@gmail.com", "javaIsFun@gmail.com"));
        List<Integer> inboxClass = new ArrayList<>(Arrays.asList(300, 150, 200, 1000));

        Map<String, Integer> map = createMap.apply(emails, inboxClass);

        System.out.println(map);
    }
}
