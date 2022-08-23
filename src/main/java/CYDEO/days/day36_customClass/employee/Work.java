package CYDEO.days.day36_customClass.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        Employee obj = new Employee("Abu", 1001101110L, "SDET", 1_000_000.5);

        obj.goToMeeting();
        System.out.println(obj);

        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Umid");
        arr[1] = new Employee("Bekhruz", 10011100);
        arr[2] = new Employee("Shahboz", 10101110, "SDET");
        System.out.println(Arrays.toString(arr));

        ArrayList<Employee> list = new ArrayList<>(List.of(arr[0], arr[1]));
    }
}
