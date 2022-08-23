package CYDEO.days.day33_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SumString {
    public static ArrayList<Integer> sumString(ArrayList<String> arr) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String v : arr) {
            int a = 0;
            for (String s : v.split("")) {
                a += Integer.parseInt(s);
            }
            numbers.add(a);
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(sumString(new ArrayList<>(Arrays.asList("123", "43", "534"))));
    }
}
