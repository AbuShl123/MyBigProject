package CYDEO.mentoring.mentoring1;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        // we can declare arrays in that way:
        int[] a = new int[5];
        // i didn't give any values to the integer.

        // 5 == length

        // We didn't give the values for the array, BUT we declared the length of this array

        System.out.println(Arrays.toString(a));

        a[0] = 10;
        a[1] = 2;
        a[2] = 8;
        a[3] = 5;
        a[4] = 12;
        System.out.println(Arrays.toString(a));

        System.out.println(a[0]);


        String[] str = new String[10];
        System.out.println(Arrays.toString(str));
        str[0] = "Monday";
        str[1] = "Tuesday";
        System.out.println(Arrays.toString(str));

        System.out.println(str[4]);
        str[4] = "Friday";
    }
}
