package CYDEO.days.day37_static.student;

import java.util.Arrays;

public class CydeoStudent {
    // instance fields
    String name;
    String city;
    int group;
    Coffee myCoffee;

    // static fields
    static int batchNumber;
    static String schoolName;
    static String[] instructors; // static means one copy, belongs to class all object share. String[] type

    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String[] {"Adam", "Asya", "Saim"}; // created a new String array and assigned into the instructors reference
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);
    }

    public CydeoStudent(String name, String city, int group, int coffee) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(coffee);
    }

    public CydeoStudent(String name, String city, int group, Coffee myCoffee) {
        this.name = name;
        this.city = city;
        this.group = group;
        this.myCoffee = myCoffee;
    }

    public static void schoolInfo() {
        System.out.println(schoolName + " Batch " + batchNumber);
        System.out.println("Instructors: " + Arrays.toString(instructors));
    }

    public void drink() {
        if (myCoffee.amountLeft < 2) {
            System.out.println("Fuck you coffee drinker, go away and work better!"); return;
        }
        System.out.println("Drinking some coffee...");
        myCoffee.amountLeft -= 2;
    }

    public void addCoffee() {
        System.out.println("Buying more coffee");
        myCoffee.amountLeft += 10;
    }

    public void work() {
        System.out.println("Go and work, my slave!");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                ", coffee=" + myCoffee.amountLeft + '\'' +
                '}';
    }
}
