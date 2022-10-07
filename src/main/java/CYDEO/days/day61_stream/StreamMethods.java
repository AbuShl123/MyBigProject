package CYDEO.days.day61_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // Create Stream
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,6,12,5));
        list.stream(); // creates the stream, need to do more
        System.out.println(list.stream());

        int[] arr1 = {3,5,6,1,2,34};
        Arrays.stream(arr1); // made stream from array

        // distinct : removes duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,3,3,4,4,6,12,5,7,7,2,10));

        System.out.println(list2.stream().distinct().collect(Collectors.toList()));
        list2 = list2.stream().distinct().collect(Collectors.toList());
        List<Integer> newRef = list2.stream().distinct().collect(Collectors.toList());
        /*
        stream() --> converts list to the stream
        .distinct() --> removes all the duplicates from the stream
        .collect(Collectors.toList()) --> converts stream back to list
         */

        int[] arr2 = {1,1,1,2,3,4,5,7,8,5,2,3,4,5,4,2,2,5,7,8};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------------------");

        // skip(n): skips/removes first n number of elements
        List<String> list3 = new ArrayList<>(Arrays.asList("summer", "bike", "fall", "raining", "pond", "lake", "fishing"));

        System.out.println(list3.stream().skip(3).collect(Collectors.toList()));
        System.out.println(list3);
        System.out.println(list3.stream().skip(6).collect(Collectors.toList()));
        System.out.println(list3.stream().skip(10).collect(Collectors.toList()));

        System.out.println("-----------------------------------------------");

        // limit (n) : keep a n number of elements
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(5).collect(Collectors.toList()));
        System.out.println("-----------------------------------------------");

        // using both and limit
        System.out.println(list4.stream().limit(6).skip(2).collect(Collectors.toList()));
        System.out.println(list4.stream().skip(4).limit(4).collect(Collectors.toList()));

        System.out.println(list4.stream().limit(2).skip(1).collect(Collectors.toList()));

        System.out.println("-----------------------------------------------");

        // count: how many elements/data in the stream
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,6,7,77,5,4,5,22,3,4,5,6,7,8,9,8,7,5,4,2));

        System.out.println(list5.stream().distinct().count());

        // task: given a String determine the number of unique characters
        String s = "aaabbbcchhddddeeegggghhhhaaasssxx";
        int count = (int)Arrays.stream(s.split("")).distinct().count();
        System.out.println("the number of unique number: " + count);
        System.out.println(Arrays.toString(Arrays.stream(s.split("")).distinct().toArray()));
    }
}

