package CYDEO.days.day25_array;

import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        int[] numbers = {3,4,1,2,5,8,2,8,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = numbers.length-1; i >= 0; i--) {
            if(numbers[i] != numbers[numbers.length-1])  {
                System.out.println("Second max: " + numbers[i]); break;
            }
        }
    }
}
