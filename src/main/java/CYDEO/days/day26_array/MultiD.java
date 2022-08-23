package CYDEO.days.day26_array;

import java.util.Arrays;

public class MultiD {
    public static void main(String[] args) {
        char[] lower = {'a', 'b', 'c', 'd'};
        char[] upper = {'A', 'B', 'C'};
        char[] other = {'$', '#', '(', '_', ')'};


        char[][] chars = new char[3][];

        chars[0] = lower;
        chars[1] = upper;
        chars[2] = other;

        System.out.println(Arrays.deepToString(chars));
    }
}
