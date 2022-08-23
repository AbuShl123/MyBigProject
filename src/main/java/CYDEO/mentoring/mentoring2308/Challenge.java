package CYDEO.mentoring.mentoring2308;

public class Challenge {
    // [2, 8, 5, 7]

    // 2+8 = 10
    // 5 + 7 = 12
    // --> 12-10 = 2

    // return the difference between the sum of the even and odd numbers
    /*
    warOfNumbers([12, 90, 75]) ➞ 27
    // 90 + 12 = 102
    // 75
    // 102 - 75 = 27

    warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
     */
    public static int warOfNumbers(int[] arr) {
        int even = 0; // will be the sum even numbers
        int odd = 0;

        for (int each : arr) {
            if (each % 2 == 0) {
                even += each;
            } else {
                odd += each;
            }
        }

        return Math.abs(even - odd);
        // even = 6
        // odd = 9
        // --> 3

//        if (even > odd) return even - odd;
//        else return odd - even;
    }

    public static void main(String[] args) {
        System.out.println(warOfNumbers(new int[] {10, 5, 1, 2}));
        // 10 + 2 = 12
        // 5 + 1 = 6
        // 12 - 6 = 6

        System.out.println(warOfNumbers(new int[] {10, 5, 7}));
        // 5 + 7 = 12
        // 10
        // 12 - 10 = 2
        // 10 - 12 = -2

        int a = -12;
        System.out.println(a);
        System.out.println(Math.abs(a));
        // Math.abs always returns the positive number - absolute value of number
    }
}
