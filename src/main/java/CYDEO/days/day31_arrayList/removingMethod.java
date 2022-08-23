package CYDEO.days.day31_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class removingMethod {
    public static void main(String[] args) {

        ArrayList<String> s = new ArrayList<>();
        s.add("Today");
        s.add("raining");
        s.add("java");
        s.add("flying");
        System.out.println(s);

        s.remove(2);
        System.out.println(s);
        System.out.println(s.remove(0));
        System.out.println(s);
    }
}

