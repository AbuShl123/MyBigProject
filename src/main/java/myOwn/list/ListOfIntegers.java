package myOwn.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(6);
        num.add(8);


        num.set(1, null);
        System.out.println(num);



        ArrayList<Integer> cleaning = new ArrayList<>();
        cleaning.add(12); cleaning.add(null); cleaning.add(null); cleaning.add(3); cleaning.add(null);
        System.out.println(cleaning);

        cleaning.removeAll(Collections.singleton(null)); // removes all null values in the List
        System.out.println(cleaning);

        cleaning.clear();
        cleaning.add(12); cleaning.add(null); cleaning.add(null); cleaning.add(3); cleaning.add(54);
        cleaning.add(null);
        System.out.println(cleaning);
        System.out.println("The size of the list: " + cleaning.size());
        System.out.println("the index of the last null: " + cleaning.lastIndexOf(null));
    }
}
