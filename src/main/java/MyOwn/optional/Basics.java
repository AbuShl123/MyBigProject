package MyOwn.optional;

import java.util.Optional;

public class Basics {
    public static void main(String[] args) {
        Optional<String> obj = Optional.of("something"); // WITHOUT 'new'
        // this optional has a value;
        boolean b = obj.isPresent(); // will throw a true because it's actually is presented with a non-null value
        System.out.println(b);
        String a = null;
        Optional<String> empty = Optional.ofNullable(a); // this optional has null value
        boolean b2 = empty.isPresent(); // will throw a false response
        System.out.println(b2);



        Optional<String> empty2 = Optional.empty(); // just empty
        boolean b3 = empty2.isEmpty(); // is it empty?    yes --> true
        System.out.println("is it empty? - " + b3 + ". So that means yes, it is empty");


        String n = null; //                         |
        if (n != null) {//                          |
            System.out.println(n.length());//       |
        }//                                         instead of these 3 lines, we just can use optional

        Optional<String> opt = Optional.of("Baeldung");
        opt.ifPresent(name -> System.out.println(name.length())); // name is a String here (variable) which value is "Baeldung" from optional


        String canBe_null = "hi";
        String orElse = Optional.ofNullable(canBe_null).orElse("john");
        System.out.println("The string is - " + orElse);
        // In case if maybe_null is really null the orElse method assigns a value
        // 2 example below:
        String canBe_null2 = null;
        Optional<String> orElse2 = Optional.ofNullable(canBe_null2);
        canBe_null2 = orElse2.orElse("john");
        System.out.println("The second string is - " + canBe_null2);
    }
}
