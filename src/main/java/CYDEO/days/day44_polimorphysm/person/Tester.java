package CYDEO.days.day44_polimorphysm.person;

public class Tester extends Employee implements CreateSmokeTest {
    public Tester(String name, double salary) {
        super(name, "QA", salary);
    }

    @Override
    public void work() {
        System.out.println("Testing");
    }

    @Override
    public void create() {
        System.out.println("creating automatic smoke test");
    }

    public void writeBugReport() {
        System.out.println("Found bug, writing report");
    }
}
