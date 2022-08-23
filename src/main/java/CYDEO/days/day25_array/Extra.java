package CYDEO.days.day25_array;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {


        String[] strs = {"hello", "hi", "hey"};
        System.out.println(Arrays.toString(strs));
        System.out.println(String.join("#", strs));

        System.out.println(String.join(" MIDDLE ", strs));

        int[] aa = new int[]{12, 4, 7, 2, 8, 10};
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(new int[]{12,6,8,0}));
    }
}
