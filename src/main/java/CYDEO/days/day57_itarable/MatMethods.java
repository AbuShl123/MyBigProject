package CYDEO.days.day57_itarable;

import java.util.HashMap;
import java.util.Map;

public class MatMethods {
    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();
        // adding to a map: put()
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 3000); // using key that is already in the map, will update the value

        System.out.println(gradeScale);
        // reading from a map: get()
        System.out.println(gradeScale.get('B')); // goes to the key ad returns its value
        System.out.println(gradeScale.get('b'));

        // removing from a map: remove()
        gradeScale.remove('Z');
        System.out.println(gradeScale);

        // contains in a map
        System.out.println("gradeScale.containsKey('C') = " + gradeScale.containsKey('C'));
        System.out.println("gradeScale.containsKey('Z') = " + gradeScale.containsKey('Z'));

        System.out.println("gradeScale.containsValue(90) = " + gradeScale.containsValue(90));
        System.out.println("gradeScale.containsValue(3000) = " + gradeScale.containsValue(3000));

    }
}
