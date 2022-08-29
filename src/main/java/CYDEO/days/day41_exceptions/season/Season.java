package CYDEO.days.day41_exceptions.season;

public class Season {
    String name;
    double highestTemp;
    double lowesTemp;

    public Season(String name, double highestTemp, double lowesTemp) {
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowesTemp = lowesTemp;
    }

    public void activity() {
        System.out.println("GENERIC SEASON");
    }

    @Override
    public String toString() {
        return name + " season with a highest temperature of " + highestTemp + " and a lowest temperature of "  + lowesTemp;
    }
}
