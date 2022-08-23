package CYDEO.days.day35_objeclClass.school;

public class School {
    String name;
    int numbersOfStudents;
    double avgGpa;


    public School(String name, int numbersOfStudents, double avgGpa) {
        this.name = name;
        this.numbersOfStudents = numbersOfStudents;
        this.avgGpa = avgGpa;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numbersOfStudents=" + numbersOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
