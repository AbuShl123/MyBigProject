package CYDEO.days.day57_itarable;


import java.util.HashMap;
import java.util.Map;

public class GroupOfPeople {
    public static void main(String[] args) {
        Map<Integer, Person> residents = new HashMap<>();
        // idea: apartment (key) - person - value
        residents.put(201, new Person("James", 48));
        residents.put(202, new Person("Anna", 24));
        residents.put(203, new Person("Faith", 32));
        residents.put(204, new Person("James", 40));

        System.out.println(residents);

        System.out.println(residents.get(202));

        System.out.println(residents.get(203).name);

        System.out.println(residents.get(204).name.substring(0,2));
    }
}
