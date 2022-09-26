package myOwn.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,5,3,7,4,6,4,2,4));
        Collections.sort(arr); // sorts the arr from min to max
        System.out.println(arr);
        int a = Collections.max(arr); // returns the largest number of arr
        System.out.println(a);
        int b = Collections.min(arr); // returns the smallest number of arr
        System.out.println(b);
        int c = Collections.frequency(arr, 4); // prints how many 4s is here
        System.out.println(c);
        Collections.reverse(arr); // reverses just like StringBuilder.reverse
        System.out.println(arr);
        Collections.swap(arr,3, 0); // swaps two elements
        System.out.println(arr);
        Collections.shuffle(arr); // make random order of elements
        System.out.println(arr);
    }
}
