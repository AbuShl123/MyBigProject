package CYDEO.days.day61_stream;

import CYDEO.days.day34_objectClass.App;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterApplications {
    public static void main(String[] args) {
        Application[] applications = {
          new Application("John Perso", 190_000, true),
          new Application("Ogahio Apiisd", 150_000, false),
          new Application("Awourv Maveles", 160_000, true),
          new Application("GoGOG Akhue", 200_000, true),
          new Application("MapHdfaoj Gigfae", 250_000, false),
          new Application("Abu Shoali", 179_999, true)
        };

        System.out.println(Arrays.stream(applications).filter(person -> person.willingToRelocate).collect(Collectors.toList()));
        System.out.println(Arrays.stream(applications).filter(person -> person.willingToRelocate).map(e -> e.name).collect(Collectors.toList()));
        System.out.println(Arrays.toString(Arrays.stream(applications).filter(person -> person.willingToRelocate).map(Application::getName).toArray()));

        System.out.println(Arrays.stream(applications).filter(e -> e.expectedSalary <= 180_000).map(Application::getName).collect(Collectors.toList()));
    }
}

class Application {
    String name;
    double expectedSalary;
    boolean willingToRelocate;

    public Application(String name, double expectedSalary, boolean willingToRelocate) {
        this.name = name;
        this.expectedSalary = expectedSalary;
        this.willingToRelocate = willingToRelocate;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", willingToRelocate=" + willingToRelocate +
                '}';
    }

    public String getName() {
        return name;
    }
}