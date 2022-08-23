package CYDEO.days.day31_arrayList;

import java.util.ArrayList;

public class addMethods {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        System.out.println(letters.size());
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');
        System.out.println(letters.size());
        System.out.println(letters.toString().replaceAll("[],]", ""));

        System.out.println(letters.get(1));
    }
}
