package CYDEO.days.day41_exceptions.season;

public class Summer extends Season{
    public Summer(double highestTemp, double lowesTemp) {
        super("Summer", highestTemp, lowesTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink lemonade");
    }
}
