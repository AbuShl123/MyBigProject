package CYDEO.days.day59_functioal_interface;

public class UsingNumber {
    public static void main(String[] args) {
        NumberInterface evenOdd = (int n) -> {
            if (n % 2 == 0)
                System.out.println(n + " is even");
            else
                System.out.println(n + " is odd");
        };
        evenOdd.test(123);
        evenOdd.test(134);

        NumberInterface negativeOrPositive = (int e) -> {
          if (e > 0)
              System.out.println(e + " is positive");
          else if (e == 0)
              System.out.println(e + " is a zero");
          else
              System.out.println(e + " is negative");
        };

        negativeOrPositive.test(140);
        negativeOrPositive.test(-13);
        negativeOrPositive.test(0);


        NumberInterface cube = (int b) -> System.out.println("b^3 = " + b*b*b);

        cube.test(16);

    }
}
