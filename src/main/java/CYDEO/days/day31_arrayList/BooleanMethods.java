package CYDEO.days.day31_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BooleanMethods {
    public int[] swapEnds(int[] nums) {
        int[] a = nums;
        int k = nums[0];
        a[0] = nums[nums.length-1];
        a[a.length-1]=nums[0];
        return a;
    }


    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        System.out.println(Arrays.toString(new BooleanMethods().swapEnds(a)));

    }
}
