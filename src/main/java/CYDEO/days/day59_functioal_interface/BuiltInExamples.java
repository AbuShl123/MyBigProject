package CYDEO.days.day59_functioal_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInExamples {

    Predicate<Integer> lessThan5 = p -> p < 5; // BuiltInExamples.lessThan5.test();

    public static void main(String[] args) {

        Predicate<Integer> isPrime = p -> {
            if (p < 1) return false;

            for (int i = 2; i < p; i++) {
                if (p % i == 0) return false;
            }

            return true;
        };

        System.out.println("isPrime.test(8) = " + isPrime.test(8));
        System.out.println("isPrime.test(-4) = " + isPrime.test(-4));
        System.out.println("isPrime.test(7) = " + isPrime.test(7));

        System.out.println("isPrime.test(5) = " + isPrime.test(5));

        List<Integer> nums = new ArrayList<>(List.of(12,1,5,7,8,5,3,57,6,23,6,8,9,14,1,17,18,119));

        nums.removeIf(isPrime);
        System.out.println(nums);

        nums = new ArrayList<>(Arrays.asList(12,1,5,7,8,5,3,57,6,23,6,8,9,14,1,17,18,119));
        nums.removeIf(e -> e < 10);


        Predicate<Integer> predicate = BuiltInExamples::isPositive;

        System.out.println("--------------------------------");

        Consumer<int[]> printArray = arr -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " - ");
            }
            System.out.println();
        };

        printArray.accept(new int[] {12,3,4,5,6,7,8,2,3,5,6,6,3,3,45,6,79,45,4,24,3,58});

        System.out.println("--------------------------------");

        List<String> list = new ArrayList<>(Arrays.asList("apple", "waterfall", "weather", "tree", "rain"));

        System.out.println("--------------------------------");
        list.forEach(System.out::println);

        System.out.println("--------------------------------");
        list.forEach(e -> {
            System.out.println("" + e.charAt(0) + e.charAt(e.length()-1));
            System.out.println(e.length());
        });

        list.forEach(e -> {
            System.out.println(e.substring(0,3));
        });


        Function<int[], List<Integer>> convertToList = (arrNums) -> {
            List<Integer> l = new ArrayList<>();
            for (int each : arrNums) {
                l.add(each);
            }
            return l;
        };

        int[] arr = {2,3,5,6,1};
        List<Integer> listOfNumbers = convertToList.apply(arr);
        System.out.println(listOfNumbers);

        Function<int[], int[]> swapElements = array -> {
          int temp = array[0];
          array[0] = array[array.length-1];
          array[array.length-1] = temp;
          return array;
        };

        System.out.println(Arrays.toString(swapElements.apply(new int[] {1,2,3,4,5,6,7,8})));
    }

    public static boolean isPositive(int n) {
        if (n > 0) return true;
        return false;
    }
}
