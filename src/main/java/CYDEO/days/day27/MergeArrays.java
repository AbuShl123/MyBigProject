package CYDEO.days.day27;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[][] a = {
                {10, 20, 30},
                {4,7,7}
        };
        int size = 0;
        for (int[] v : a) {
            size += v.length;
        }

        int[] arr = new int[size];
        int counter = 0;
        for (int[] v : a) {
            for (int e : v) {
                arr[counter++] = e;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
