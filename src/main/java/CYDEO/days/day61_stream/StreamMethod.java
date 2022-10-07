package CYDEO.days.day61_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamMethod {
    public static void main(String[] args) {
        // how to make from arr[] to List<>?
        int[] arr = {3,4,5,2,15,4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // boxed() --> converts the data from int to Integer -> result is Stream<Integer>

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,5,6,7,2));

        int[] arr2 = list2.stream().mapToInt(n -> n).toArray();


        ToIntFunction<Integer> fromIntegerToInt = (e) -> e;

        List<String> months = new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

        months = months.stream().map(e -> e.substring(0,3).toUpperCase()).collect(Collectors.toList());
        System.out.println(months);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,6,7,8,9,10,4,4,9,11,12,13,8,14,15,16,17,8,18,17,6,20, 19, 18));

        List<Integer> evens = numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
        List<Integer> odds = numbers.stream().filter(e -> e%2==1).collect(Collectors.toList());
        System.out.println(evens);
        System.out.println(odds);

        // count how many evens:
        int countEvens = (int) numbers.stream().filter(e -> e%2 == 0).count();
        int countUniqueEvens = (int) numbers.stream().filter(e -> e%2 == 0).distinct().count();

        System.out.println(countEvens);
        System.out.println(countUniqueEvens);

        List<String> words = new ArrayList<>(Arrays.asList("java", "soft skills", "javascript", "JAVA", "jAVAscript", "selenium", "restassured", "cypress"));

        int countJava = (int) words.stream().map(e -> e.toLowerCase(Locale.ROOT)).filter(e -> e.contains("java")).count();

        System.out.println("words that contain java: " + countJava);

        System.out.println(words.stream().filter(e -> {
            e = e.toLowerCase(Locale.ROOT);
            return e.contains("java");
        }).collect(Collectors.toList()));


        System.out.println(words.stream().filter(e -> e.toLowerCase().contains("java")).count());

        words.stream().map(String::toLowerCase).forEach(e -> System.out.print(e + " "));
        words.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}
