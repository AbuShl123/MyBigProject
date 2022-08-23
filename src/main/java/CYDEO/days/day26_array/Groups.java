package CYDEO.days.day26_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String[][] cydeo = {
                {"Alen", "Tina", "Alena", "Nargiza"},
                {"Anam", "Baz", "Bursa", "Ostap"},
                {"Rabia", "Shahad"},
                {"Ketino", "Evlul", "Nadia"}
        };

        System.out.println(Arrays.deepToString(cydeo));

        System.out.println(cydeo.length);
        System.out.println(cydeo[2].length);
        System.out.println(cydeo[0][3]);
        System.out.println(Arrays.toString(cydeo[1]));
        System.out.println("---------------");
        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.print(eachName + " ");
            }
            System.out.println();
        }

        System.out.println("---------------");
        for (String[] eachInner : cydeo) {
            for (String eachName : eachInner) {
                System.out.print(eachName.substring(eachName.length()-1).toUpperCase());
            }
            System.out.println();
        }
    }
}
