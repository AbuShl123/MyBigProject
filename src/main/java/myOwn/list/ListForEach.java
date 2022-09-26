package myOwn.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListForEach {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(10);
        // simple for each loop
        System.out.println("hello from for each loop");
        for (int a : numbers) { System.out.println(a); } // 3 lines
        System.out.println("--------------");


        System.out.println("hello from forEach() method");
        numbers.forEach(n -> System.out.println(n)); // method lambda
        System.out.println("--------------");


        System.out.println("hello from forEach() method but reference");
        numbers.forEach(System.out::println); // method reference
        System.out.println("--------------");


        System.out.println("Hello from consumer");
        Consumer<Integer> what = n -> System.out.println(n);
        numbers.forEach(what);


    }
}
