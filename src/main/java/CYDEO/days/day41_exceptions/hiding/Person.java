package CYDEO.days.day41_exceptions.hiding;

public class Person {
    String name = "James Bond";
}

class secretIdentity extends Person{
    String name = "Michael Jackson";
}

class Runner {
    public static void main(String[] args) {
        System.out.println(new Person().name);
        System.out.println(new secretIdentity().name);

    }
}
