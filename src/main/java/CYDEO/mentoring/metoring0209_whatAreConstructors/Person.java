package CYDEO.mentoring.metoring0209_whatAreConstructors;

public class Person {
    // instance fields :
    String name; // null
    int age; // 0

    public Person() {}

    public Person(String inputName, int inputAge) {
        name = inputName;
        age = inputAge;
    }

    public static void main(String[] args) {
        Person obj = new Person(); // creating the object with default empty constructor
        System.out.println(obj.name); // null
        System.out.println(obj.age); // 0

        obj.name = "Paul";
        obj.age = 23;

        System.out.println(obj.name + " is " + obj.age + " years old");

        Person obj2 = new Person("James", 14);
        System.out.println(obj2.name + " is " + obj2.age + " years old");
    }
}
