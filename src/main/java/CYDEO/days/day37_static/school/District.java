package CYDEO.days.day37_static.school;

public class District {
    public static void main(String[] args) {
        School.district = 149;
        School.totalTeachers = 100;
        School.totalStudents = 3000;

        School.totalTeachers--;

        System.out.println(School.district);
        System.out.println(School.totalTeachers);
        System.out.println(School.totalStudents);

        School.announcement();
        // School.lunch() // lunch is an instance
        School object = new School();
        object.lunchTime = 12;
        object.lunch();

        object.totalStudents = 5000;
        System.out.println(School.totalStudents);
    }
}
