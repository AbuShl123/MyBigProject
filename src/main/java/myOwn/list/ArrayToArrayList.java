package myOwn.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = {3,5,1,1};

        Arrays.asList(arr);

        Integer[] a = {3, 4, 4, 6};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(a));

        // the way we usually create an ArrayList -

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,7,1));
        System.out.println(list);
    }
}
