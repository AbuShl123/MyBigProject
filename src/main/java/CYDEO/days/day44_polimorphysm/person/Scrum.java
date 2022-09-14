package CYDEO.days.day44_polimorphysm.person;

public class Scrum {
    public static void main(String[] args) {
        Person person = new Tester("Abu", 1_000_000);

        Employee employee = new Tester("Jose Penso", 900_000);
        System.out.println(employee.name);
        System.out.println(employee.jobTitle);
        System.out.println(employee.salary);
        employee.work();

        Object object = new Tester("Bekhruz", 12_000_000);

        CreateSmokeTest createSmokeTest = new Tester("Ali", 1000);
        createSmokeTest.create();


        Tester tester = new Tester("Amin", 10_000_000);
        System.out.println(tester.name);
        System.out.println(tester.jobTitle);
        System.out.println(tester.salary);
        tester.create();
        tester.work();
        tester.writeBugReport();
    }
}
