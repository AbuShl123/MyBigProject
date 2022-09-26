package myOwn.conceptsOOP.Polymorphism.morePolymorphism;

public class Employee {
    final private String name;
    private String address;
    final private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("mailing check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address + " " + number;
    }

    public int getNumber() {
        return number;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



