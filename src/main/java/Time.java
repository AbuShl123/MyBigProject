import CYDEO.days.day40_inheritance.shape.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Time {
    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
            result+=str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }
}





