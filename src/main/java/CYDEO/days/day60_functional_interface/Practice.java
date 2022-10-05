package CYDEO.days.day60_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {

        Predicate<Integer> dupDigits = n -> {
            StringBuilder b = new StringBuilder();
            while (n > 0) {
                int digit = n % 10;
                n = (n - digit) / 10;
                if (b.toString().contains("" + digit)) return false;
                b.append(digit);
            }
            return true;
        };

        System.out.println("dupDigits.test(1003425) = " + dupDigits.test(1003425));
        System.out.println("dupDigits.test(130) = " + dupDigits.test(130));
        System.out.println("dupDigits.test(133) = " + dupDigits.test(133));
        System.out.println("dupDigits.test(1764) = " + dupDigits.test(1764));
        System.out.println("dupDigits.test(900) = " + dupDigits.test(900));
        System.out.println("dupDigits.test(7862) = " + dupDigits.test(7862));
        System.out.println("dupDigits.test(1000) = " + dupDigits.test(1000));

        Consumer<String> middleChars = str -> {
            int len = str.length();
            if (len % 2 == 0) { // door
                System.out.println(str.substring(len/2-1, len/2+1));
            } else {
                System.out.println(str.charAt(len/2)); //
            }
        };


        middleChars.accept("apple");
        middleChars.accept("door");
        middleChars.accept("waterfall");
        middleChars.accept("mountains");
        middleChars.accept("banana");
        middleChars.accept("Universe");
        middleChars.accept("moon");

        Function<String ,Integer> sumOfDigitsInString = str -> {
            int n = 0;
            for (char c : str.toCharArray()) {
                n += Integer.parseInt(""+c);
            }
            return n;
        };

        System.out.println("sumOfDigitsInString.apply(\"943875\") = " + sumOfDigitsInString.apply("943875"));

        Predicate<Integer> isDivisibleBy3 = e -> sumOfDigitsInString.apply("" + e) % 3 == 0;

        System.out.println("isDivisibleBy3.test(309843095) = " + isDivisibleBy3.test(309843093));
    }
}
