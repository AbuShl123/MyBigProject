package CYDEO.days.day37_static.driver;

public class Driver {
    String name;
    long licenceNumber;
    char licenceType;

    public Driver(String name, long licenceNumber, char licenceType) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.licenceType = licenceType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", licenceType=" + licenceType +
                '}';
    }
}
