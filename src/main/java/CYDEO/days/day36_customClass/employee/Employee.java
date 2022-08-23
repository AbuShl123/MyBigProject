package CYDEO.days.day36_customClass.employee;

public class Employee {
    String name;
    long id;
    String job_title;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, long id) {
        this(name);
        this.id = id;
    }

    public Employee(String name, long id,  String job_title) {
        this(name, id);
        this.job_title = job_title;
    }

    public Employee(String name, long id, String job_title, double salary) {
        this(name, id, job_title);
        this.salary = salary;
    }

    public void goToMeeting() {
        System.out.println(name + "      is going to meeting");
    }

    @Override
    public String toString() {
        String output = "Name = " + name;
        if (job_title != null) output += ", Job title = " + job_title;
        if (id != 0) output += ", ID = " + id;
        if (salary != 0) output += ", Salary = " + salary;
        return output;
    }
}
