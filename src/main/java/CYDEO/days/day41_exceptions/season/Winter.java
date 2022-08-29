package CYDEO.days.day41_exceptions.season;

public class Winter extends Season {
    public Winter(double highestTemp, double lowesTemp) {
        super("winter", highestTemp, lowesTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
        System.out.println("Code java");
    }
}
