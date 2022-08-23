package MyOwn.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionType {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,5,8,2,5));

        ArrayList<Integer> arr2 = new ArrayList<>(arr);

        System.out.println(arr);
        System.out.println(arr2);

        if (arr.equals(arr2)) System.out.println("They are equal");
        else System.out.println("They are NOT equal");
    }
}
