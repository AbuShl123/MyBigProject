package CYDEO.days.day61_stream;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class Recap {
    public static void main(String[] args) {


        BiPredicate<int[], int[]> areEqual = (int[] arr1, int[] arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        int[] numbers = {4,7,1};

        int[] arr = {7,1,4};

        System.out.println(areEqual.test(numbers, arr));



        BiFunction<String, String, String> commonChars = (str1, str2) -> {
            StringBuilder common = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                String s = str1.substring(i,i+1);
                if (!common.toString().contains(s) && str2.contains(s)) {
                    common.append(s);
                }
            }
            return common.toString();
        };

        String py = "Python";
        String s = "WoodenP Spoon";

        System.out.println(commonChars.apply(py, s));

    }
}
