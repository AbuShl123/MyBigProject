package CYDEO.days.day25_array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 7, 8, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 12));
        System.out.println(Arrays.binarySearch(arr, 9));
    }
}
