package CYDEO.days.day25_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumAndAdd {
    public static void main(String[] args) {
        int[] arr = {1,5,8,2,0};
        int[] n = Arrays.copyOf(arr, arr.length+1);
        for (int v : arr) {
            n[n.length-1] += v;
        }
        System.out.println(Arrays.toString(n));
    }
}
