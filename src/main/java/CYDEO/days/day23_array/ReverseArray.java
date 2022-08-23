package CYDEO.days.day23_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] reversed = new int[arr.length];

        for (int i = arr.length-1, y = 0; i >= 0; i--, y++) {
            reversed[y] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
