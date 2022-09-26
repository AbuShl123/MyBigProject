package myOwn.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfLists {
    public static void main(String[] args) {
        List<Integer> num1 = List.of(1,2,3,4,5);
        List<Integer> num2 = List.of(5,4,3,2,1);

        List<List<Integer>> arr = new ArrayList<>(List.of(num1, num2));
        System.out.println(arr);

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(6,7,8,9,10));

        arr.add(arrayList);
        System.out.println(arr);
    }
}
