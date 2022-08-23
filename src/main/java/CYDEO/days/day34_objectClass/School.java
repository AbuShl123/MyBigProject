package CYDEO.days.day34_objectClass;

public class School {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        s1.name = "Qlana";
        s1.batchNumber = 27;
        s1.grade = 11;
        s1.program = "SDET";

        System.out.println(s1.name);

        // call in the instance method
        //Student.study(); this only work if method was static
        s1.study();

        System.out.println("----------------------");
        Student s2 = new Student();

        System.out.println(s2.name);
        s2.name = "Qlana";

    }
}
