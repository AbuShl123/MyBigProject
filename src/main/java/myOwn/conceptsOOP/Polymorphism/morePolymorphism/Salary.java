package myOwn.conceptsOOP.Polymorphism.morePolymorphism;

public class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        if (salary >= 0.0) {
            this.salary = salary;
        }
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary1) {
        if (salary1 >= 0.0) {
            this.salary = salary1;
        }
    }

    public double computeSalary() {
        System.out.println("Computing salary pay for" + this.getName());
        return salary/52;
    }
}
