package CYDEO.days.day37_static.school;

public class School {
    public int lunchTime;
    public static int district;
    public static int totalTeachers;
    public static int totalStudents;

    public static void announcement() {
        System.out.println("announcement to the whole distract");
    }

    public void lunch() {
        System.out.println("Lunch is at: " + lunchTime);
    }

}
