package CYDEO.days.day36_customClass.offer;

public class Offer {
    String name;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPto;

    public Offer() {}

    public Offer(String name) {
        this.name = name;
    }

    public Offer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Offer(String name, String location, double salary) {
        this(name, location);
        this.salary = salary;
    }

    public Offer(String name, String location, double salary, boolean isFullTime, int numberOfPto) {
        this(name, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }
}

