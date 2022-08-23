package CYDEO.days.day39_inheritance.people;

public class Person {

    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        // super(); -->  calls the parent constructor
        this.name = name;
        this.age = age;
    }
}


