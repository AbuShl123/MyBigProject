package MyOwn.conceptsOOP.Polymorphism;

class Person {
    void walk() {
        System.out.println("can Run...");
    }
}

class Employee extends Person {
    void walk() {
        System.out.println("Running fast...");
    }

    public static void main(String[] args) {
        Person p = new Employee(); //upcasting
        Employee em = new Employee();
        em.walk();
        p.walk();

    }
}
