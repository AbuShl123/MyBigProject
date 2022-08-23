package CYDEO.days.day33_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(6, 2, 8, 10));
        nums.addAll(other);
        System.out.println(nums);
        nums.addAll(Arrays.asList(8, 6, 9, 3));
        System.out.println(nums);
        nums.addAll(0, Arrays.asList(2, 10, 4));
        System.out.println(nums);

        System.out.println(nums.containsAll(Arrays.asList(6, 2, 10, 3)));
        nums.retainAll(Arrays.asList(2, 10));
        System.out.println(nums);


        nums.removeAll(List.of(10, 2));
        System.out.println(nums);
    }
}
