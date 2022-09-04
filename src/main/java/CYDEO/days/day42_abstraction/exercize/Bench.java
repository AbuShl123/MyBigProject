package CYDEO.days.day42_abstraction.exercize;

public class Bench extends Lifting
{

    @Override
    public void perform() {
        System.out.println("Bench press");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10 * minutes);
    }

    @Override
    public void rackWeights() {
        System.out.println("putting the bar back on the rack");
    }
} // Bench is my concrete class
