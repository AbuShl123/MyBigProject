package CYDEO.days.day44_polimorphysm.person;

public abstract class Employee extends Person{
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        super(name);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public abstract void work();
}
