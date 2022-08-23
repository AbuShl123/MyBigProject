package MyOwn.stream_;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        // Stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

        // Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

        List<Integer> numbers = List.of(5,2,6,4,3);
        List<Integer> squared =
                numbers.stream().map(x->x*x).collect(Collectors.toList()); // using map!
        System.out.println(squared);
        System.out.print("forEach: ");
        numbers.stream().map(x -> x*x).forEach(y -> System.out.print(y + " "));


        List<String> names = List.of("Abubakr", "Paul", "Steve", "John");
        List<String> name =
                names.stream().filter(n -> n.contains("a")).collect(Collectors.toList());
        System.out.println(name); // filter method ...

        List<Integer> sorting =
                numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sorting); // using sorted method
        List<String> stringSorting =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(stringSorting);

        List<Integer> sortingSquared =
                numbers.stream().map(x -> x*x).sorted().collect(Collectors.toList());
        // using map and sorting at the same time
        System.out.println(sortingSquared);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        int even =
                numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum);
        System.out.println(even);
        int sum = 0;
        //   List<Integer> numbers = List.of(5,2,6,4,3);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);
    }
}
