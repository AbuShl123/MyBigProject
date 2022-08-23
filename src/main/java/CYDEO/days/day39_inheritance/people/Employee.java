package CYDEO.days.day39_inheritance.people;

public class Employee extends Person {

    double salary;

    public Employee(String name, int age) {
        super(name, age); // calls parent constructor with 2 args
    }

    public Employee(String name, int age, double salary) {
        this(name, age); // calls above constructor
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
    public Employee() {
        supers(); --> calls no args parent constructor
    }

 */