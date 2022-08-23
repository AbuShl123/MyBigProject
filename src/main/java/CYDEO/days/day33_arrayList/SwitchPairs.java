package CYDEO.days.day33_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    public static ArrayList<String> switchPairs(ArrayList<String> arr) {
        for (int i = 0; i < arr.size()-1; i+=2) {
            Collections.swap(arr, i, i+1);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Hat", "Sky", "Sun", "Cloud", "Ball", "Bowl"));
        System.out.println(switchPairs(arr));
    }
}
