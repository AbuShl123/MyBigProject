package CYDEO.days.day44_polimorphysm.person;

public class Developer extends Employee{
    public Developer(String name, double salary) {
        super(name, "developer", salary);
    }

    @Override
    public void work() {
        System.out.println("Writing a code");
    }

    public void UnitTesting() {
        System.out.println("Creating unit testing");
    }
}
