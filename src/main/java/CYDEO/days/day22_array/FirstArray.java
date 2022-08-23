package CYDEO.Days.day22_array;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        int[] ints = {12,5,7,3,9,3};

        ints = Arrays.stream(ints).sorted().toArray();
        System.out.println(Arrays.toString(ints));
    }
}
