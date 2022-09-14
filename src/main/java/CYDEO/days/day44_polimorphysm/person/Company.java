package CYDEO.days.day44_polimorphysm.person;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Tester("Abu", 12_000));
        list.add(new Tester("Amin", 10_000));
        list.add(new Developer("James", 1_000_000));
        list.add(new Developer("Bekhruz", 12_000_000));
        list.add(new Developer("Umid", 11_000_000));
        list.add(new Developer("Shahboz", 9_000_000));
        list.add(new Developer("Ahmadali", 10_000_000));
        double biggestSalary = list.get(0).salary;

        for (Employee e : list) {
            if (e.salary > biggestSalary) {
                biggestSalary = e.salary;
            }
        }

        System.out.println(biggestSalary);
    }
}
