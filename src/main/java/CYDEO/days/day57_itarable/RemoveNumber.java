package CYDEO.days.day57_itarable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumber {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(
                Arrays.asList(1,-2,3,5,12,2,7,34,-8,56,3,12,8,-23,-8,2,1,9,6,4,7,3,12));

        // remove all numbers < 5

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) {
            int num = it.next();
            if (num < 5 || num > 10 || num%2 == 1) it.remove();
        }

        System.out.println(nums);
    }
}
